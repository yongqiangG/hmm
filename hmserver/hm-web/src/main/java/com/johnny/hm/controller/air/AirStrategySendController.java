package com.johnny.hm.controller.air;

import com.johnny.hm.bean.Air;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.air.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/air/send")
public class AirStrategySendController {
    @Autowired
    AirService airService;
    @GetMapping("/")
    public List<Air> getAirWithStrategy(){
        return airService.getAirWithStrategy();
    }
    @PutMapping("/")
    public RespBean changeAirStrategy(@RequestBody Air air){
        if(airService.changeAirStrategy(air)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
}
