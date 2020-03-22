package com.johnny.hm.mapper;


import com.johnny.hm.bean.RoomType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoomType record);

    int insertSelective(RoomType record);

    RoomType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoomType record);

    int updateByPrimaryKey(RoomType record);

    int updateRoomType(RoomType record);

    List<RoomType> getRoomType(Integer id);

    int delRoomType(@Param("ids") Integer[] ids);

    List<RoomType> getRoomTypeWithAir(Integer id);
}