package com.johnny.hm.controller.air;

import com.johnny.hm.bean.Air;
import com.johnny.hm.bean.RoomType;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.air.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/air/count")
public class AirController {
    @Autowired
    AirService airService;

    @GetMapping("/")
    public List<RoomType> getRoomTypeWithAir() {
        return airService.getRoomTypeWithAir();
    }

    @PutMapping("/")
    public RespBean putAirs(@RequestBody List<Air> airs) {
        //去除无效的空调
        for (int i = airs.size() - 1; i >= 0; i--) {
            Air air = airs.get(i);
            if(air.getRoomTypeId()==null){
                airs.remove(air);
            }
        }
        if (airService.putAirs(airs) == airs.size()) {
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
}
