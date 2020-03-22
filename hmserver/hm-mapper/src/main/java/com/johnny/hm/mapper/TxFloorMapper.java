package com.johnny.hm.mapper;

import com.johnny.hm.bean.TxFloor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TxFloorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TxFloor record);

    int insertSelective(TxFloor record);

    TxFloor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TxFloor record);

    int updateByPrimaryKey(TxFloor record);

    List<TxFloor> getFloor(Integer id);

    int delFloor(@Param("ids") Integer[] ids);
}