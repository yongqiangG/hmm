package com.johnny.hm.controller.room;

import com.johnny.hm.bean.Building;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.room.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setting/building")
public class BuildingController {
    @Autowired
    BuildingService buildingService;

    @GetMapping("/")
    public List<Building> getBuilding(){
        return buildingService.getBuilding();
    }

    @PostMapping("/")
    public RespBean postBuilding(@RequestBody Building building){
        if(buildingService.postBuilding(building)==1){
            return RespBean.ok("新增成功");
        }
        return RespBean.err("新增失败");
    }

    @PutMapping("/")
    public RespBean putBuilding(@RequestBody Building building){
        if(buildingService.putBuilding(building)==1){
            return RespBean.ok("更新成功");
        }
        return RespBean.err("更新失败");
    }

    @DeleteMapping("/")
    public RespBean delBuilding(Integer[] ids){
        if(buildingService.delBuilding(ids)==ids.length){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }
}
