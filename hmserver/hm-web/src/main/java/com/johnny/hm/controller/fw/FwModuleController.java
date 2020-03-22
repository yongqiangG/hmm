package com.johnny.hm.controller.fw;

import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.fw.FwModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fw/upload/fmodule")
public class FwModuleController {
    @Autowired
    FwModuleService fwModuleService;

    @PutMapping("/")
    public RespBean putFwModule(Integer fid, Integer[] mids) {
        int result = fwModuleService.putModule(fid, mids);
        if(result==0){
            return RespBean.ok("更新成功");
        }
        if(result==mids.length){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }

}
