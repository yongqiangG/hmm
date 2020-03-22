package com.johnny.hm.controller.fw;

import com.johnny.hm.bean.FwInfo;
import com.johnny.hm.bean.FwType;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.fw.FwInfoService;
import com.johnny.hm.service.fw.FwTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/fw/download")
public class FwDownController {
    @Autowired
    FwInfoService fwInfoService;
    @Autowired
    FwTypeService fwTypeService;
    @GetMapping("/fwinfo/")
    public RespBean getFwInfo(@RequestParam(defaultValue = "1")Integer page,
                              @RequestParam(defaultValue = "10") Integer size,
                              Integer fwTypeId
    ){
        return fwInfoService.getByPage(page,size,fwTypeId);
    }

    @GetMapping("/fwtype/")
    public List<FwType> getFwType(){
        return fwTypeService.getFwType();
    }
    @GetMapping("/down/{fid}")
    public ResponseEntity<InputStreamResource> downFw(@PathVariable("fid") Integer fid) throws IOException {
        //根据id获取到文件路径
        FwInfo fwInfo = fwInfoService.getById(fid);
        String path = fwInfo.getFwPath();
        FileSystemResource file = new FileSystemResource(path);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getFilename()));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        return ResponseEntity
                .ok()
                .headers(headers)
                .contentLength(file.contentLength())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new InputStreamResource(file.getInputStream()));
    }
}
