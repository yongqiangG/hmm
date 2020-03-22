package com.johnny.hm.controller.fw;

import com.johnny.hm.bean.FwInfo;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.fw.FwInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/fw/upload/fwinfo")
public class FwInfoController {
    private static Logger logger = LoggerFactory.getLogger(FwInfoController.class);
    @Autowired
    FwInfoService fwInfoService;
    @DeleteMapping("/")
    public RespBean delFwInfo(Integer[] ids){
        if(fwInfoService.delByIds(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }
    @PutMapping("/")
    public RespBean putFwInfo(@RequestBody FwInfo fwInfo){
        if(fwInfoService.putFwInfo(fwInfo)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
    @GetMapping("/")
    public RespBean getFwInfo(@RequestParam (defaultValue = "1")Integer page,
                              @RequestParam(defaultValue = "10") Integer size,
                              Integer fwTypeId
                                  ){
        return fwInfoService.getByPage(page,size,fwTypeId);
    }
    @PostMapping("/up/{tid}")
    public RespBean upFw(MultipartFile file,@PathVariable("tid") Integer tid){
        String fileName = file.getOriginalFilename();
        String path = null;
        //保存文件
        if(fileName.endsWith("hex")){
            path="D:/uploadFirmware/"+new Date().getTime()+"_"+file.getOriginalFilename();
            File newFile=new File(path);
            if (!newFile.getParentFile().exists()) {
                boolean result = newFile.getParentFile().mkdirs();
                if (!result) {
                    return RespBean.err("上传失败");
                }
            }
            try {
                file.transferTo(newFile);
            } catch (IOException e) {
                return RespBean.err("上传失败");
            }
        }
        FwInfo fwInfo = new FwInfo();
        fwInfo.setFwPath(path);
        fwInfo.setName(fileName);
        fwInfo.setFwTypeId(tid);
        int result = fwInfoService.addFw(fwInfo);
        if(result==1){
            RespBean respBean = new RespBean();
            respBean.setObj(fwInfo.getId());
            respBean.setMsg("上传成功");
            return respBean;
        }
        return RespBean.err("上传失败");
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
