package com.johnny.hm.mapper;

import com.johnny.hm.bean.Position;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> getAllPosition();

    int postPosition(Position position);

    int putPosition(Position position);

    int deleteByIds(@Param("ids") Integer[] ids);
}