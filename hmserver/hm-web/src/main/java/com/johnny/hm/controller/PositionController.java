package com.johnny.hm.controller;

import com.johnny.hm.bean.Position;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.PosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {
    @Autowired
    PosService posService;

    @GetMapping("/")
    public List<Position> getPos(){
        return posService.getPos();
    }

    @PostMapping("/")
    public RespBean postPos(@RequestBody Position position){
        if(posService.postPos(position)==1){
            return RespBean.ok("新增成功");
        }
        return RespBean.err("新增失败");
    }

    @PutMapping("/")
    public RespBean putPos(@RequestBody Position position){
        if(posService.putPos(position)==1){
            return RespBean.ok("更新成果");
        }
        return RespBean.err("更新失败");
    }

    @DeleteMapping("/")
    public RespBean delPos(Integer[] ids){
        if(posService.delPos(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }

}
