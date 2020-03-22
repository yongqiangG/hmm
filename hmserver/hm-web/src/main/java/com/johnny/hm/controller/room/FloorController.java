package com.johnny.hm.controller.room;

import com.johnny.hm.bean.TxFloor;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.room.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setting/floor")
public class FloorController {
    @Autowired
    FloorService floorService;
    @GetMapping("/")
    public List<TxFloor> getFloor(){
        return floorService.getFloor();
    }
    @PostMapping("/")
    public RespBean postFloor(@RequestBody TxFloor txFloor){
        if(floorService.postFloor(txFloor)==1){
            return RespBean.ok("新增成功");
        }
        return RespBean.err("新增失败");
    }
    @PutMapping("/")
    public RespBean putFloor(@RequestBody TxFloor txFloor){
        if(floorService.putFloor(txFloor)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
    @DeleteMapping("/")
    public RespBean delFloor(Integer[] ids){
        if(floorService.delFloor(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }
}
