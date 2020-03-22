package com.johnny.hm.controller.fw;

import com.johnny.hm.bean.FwType;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.fw.FwTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fw/upload/fwtype")
public class FwTypeController {
    @Autowired
    FwTypeService fwTypeService;
    @GetMapping("/")
    public List<FwType> getFwType(){
        return fwTypeService.getFwType();
    }
    @PutMapping("/")
    public RespBean putFwType(@RequestBody FwType fwType){
        if(fwTypeService.putFwType(fwType)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
    @PostMapping("/")
    public RespBean postFwType(@RequestBody FwType fwType){
        if(fwTypeService.postFwType(fwType)==1){
            return RespBean.ok("新增成功");
        }
        return RespBean.err("新增失败");
    }
    @DeleteMapping("/")
    public RespBean delFwType(Integer[] ids){
        if(fwTypeService.delByIds(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }
}
