package com.johnny.hm.service.room;

import com.johnny.hm.bean.Building;
import com.johnny.hm.bean.Hr;
import com.johnny.hm.mapper.BuildingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BuildingService {
    @Autowired
    BuildingMapper buildingMapper;

    public List<Building> getBuilding() {
        Integer id = ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        return buildingMapper.getBuildingById(id);
    }

    public int postBuilding(Building building) {
        building.setHotelId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        return buildingMapper.insert(building);
    }

    public int putBuilding(Building building) {
        building.setCreateDate(new Date());
        return buildingMapper.updateByPrimaryKey(building);
    }

    public int delBuilding(Integer[] ids) {
        return buildingMapper.delBuilding(ids);
    }
}
