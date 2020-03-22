package com.johnny.hm.controller.fw;

import com.johnny.hm.bean.ModuleType;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.fw.ModuleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fw/upload/mtype")
public class ModuleTypeController {
    @Autowired
    ModuleTypeService moduleTypeService;
    @GetMapping("/")
    public List<ModuleType> getModule(){
        return moduleTypeService.getModule();
    }
    @PutMapping("/")
    public RespBean putModule(@RequestBody ModuleType moduleType){
        if(moduleTypeService.putModule(moduleType)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
    @PostMapping("/")
    public RespBean postModule(@RequestBody ModuleType moduleType){
        if(moduleTypeService.postModule(moduleType)==1){
            return RespBean.ok("新增成功");
        }
        return RespBean.err("新增失败");
    }
    @DeleteMapping("/")
    public RespBean delModule(Integer[] ids){
        if(moduleTypeService.delModule(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }
}
