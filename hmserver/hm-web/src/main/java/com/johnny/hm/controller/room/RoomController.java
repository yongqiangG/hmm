package com.johnny.hm.controller.room;

import com.johnny.hm.bean.Room;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setting/room")
public class RoomController {
    @Autowired
    RoomService roomService;
    @GetMapping("/")
    public RespBean getRoomByPage(@RequestParam(defaultValue = "1")Integer page,
                                    @RequestParam(defaultValue = "10")Integer size,
                                    String kw){
        return roomService.getRoom(page,size,kw);
    }

    @GetMapping("/rid/{rid}")
    public List<Room> getRoomByRid(@PathVariable("rid")Integer rid){
        return roomService.getRoomByRid(rid);
    }

    @PostMapping("/")
    public RespBean postRoom(@RequestBody Room room){
        if(roomService.postRoom(room)==1){
            return RespBean.ok("新增成功");
        }
        return RespBean.err("新增失败");
    }
    @PutMapping("/")
    public RespBean putRoom(@RequestBody Room room){
        if(roomService.putRoom(room)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
    @DeleteMapping("/")
    public RespBean delRoom(Integer[] ids){
        if(roomService.delRoom(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }
}
