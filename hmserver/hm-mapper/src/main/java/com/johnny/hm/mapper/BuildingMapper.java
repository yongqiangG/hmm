package com.johnny.hm.mapper;
import com.johnny.hm.bean.Building;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuildingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    List<Building> getBuildingById(Integer id);

    int delBuilding(@Param("ids") Integer[] ids);
}