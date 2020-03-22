package com.johnny.hm.mapper;


import com.johnny.hm.bean.Room;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);

    List<Room> getRoom(@Param("id") Integer id,@Param("page") Integer page,
                       @Param("size") Integer size,@Param("kw") String kw
    );

    int delRoom(@Param("ids") Integer[] ids);

    int updateRoom(Room room);

    int getTotal(@Param("hotelId") int hotelId,@Param("kw") String kw);

    List<Room> getRoomByRid(Integer rid);
}