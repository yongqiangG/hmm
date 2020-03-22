package com.johnny.hm.mapper;


import com.johnny.hm.bean.Air;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Air record);

    int insertSelective(Air record);

    Air selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Air record);

    int updateByPrimaryKey(Air record);

    void deleteAirs(Integer roomTypeId);

    int putAirs(@Param("airs") List<Air> airs);

    List<Air> getAirWithStrategy(Integer id);

    int changeStrategy(Air air);
}