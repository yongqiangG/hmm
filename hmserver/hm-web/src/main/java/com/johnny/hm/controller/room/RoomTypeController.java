package com.johnny.hm.controller.room;

import com.johnny.hm.bean.RoomType;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.room.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setting/roomtype")
public class RoomTypeController {
    @Autowired
    RoomTypeService roomTypeService;
    @GetMapping("/")
    public List<RoomType> getRoomType(){
        return roomTypeService.getRoomType();
    }
    @PostMapping("/")
    public RespBean postRoomType(@RequestBody RoomType roomType){
        if(roomTypeService.postRoomType(roomType)==1){
            return RespBean.ok("新增成功");
        }
        return RespBean.err("新增失败");
    }
    @PutMapping("/")
    public RespBean putRoomType(@RequestBody RoomType roomType){
        if(roomTypeService.putRoomType(roomType)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
    @DeleteMapping("/")
    public RespBean delRoomType(Integer[] ids){
        if(roomTypeService.delRoomType(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }
}
