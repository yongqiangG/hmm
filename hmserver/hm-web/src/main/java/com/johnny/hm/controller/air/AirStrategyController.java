package com.johnny.hm.controller.air;

import com.johnny.hm.bean.AirStrategy;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.air.AirStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/air/strategy")
public class AirStrategyController {
    @Autowired
    AirStrategyService airStrategyService;
    @GetMapping("/")
    public List<AirStrategy> getStrategy(){
        return airStrategyService.getStrategy();
    }
    @PutMapping("/")
    public RespBean putStrategy(@RequestBody AirStrategy airStrategy){
        if(airStrategyService.putStrategy(airStrategy)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }
    @PostMapping("/")
    public RespBean postStrategy(@RequestBody AirStrategy airStrategy){
        if(airStrategyService.postStrategy(airStrategy)==1){
            return RespBean.ok("新增成功");
        }
        return RespBean.err("新增失败");
    }
    @DeleteMapping("/")
    public RespBean delStrategy(Integer[] ids){
        if(airStrategyService.delStrategy(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }

}
