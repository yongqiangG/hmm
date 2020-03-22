package com.johnny.hm.mapper;


import com.johnny.hm.bean.AirStrategy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirStrategyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AirStrategy record);

    int insertSelective(AirStrategy record);

    AirStrategy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AirStrategy record);

    int updateByPrimaryKey(AirStrategy record);

    List<AirStrategy> getStrategy(int hotelId);

    int delByIds(@Param("ids") Integer[] ids);
}