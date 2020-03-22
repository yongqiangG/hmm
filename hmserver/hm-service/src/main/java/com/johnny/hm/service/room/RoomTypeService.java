package com.johnny.hm.service.room;

import com.johnny.hm.bean.Hr;
import com.johnny.hm.bean.RoomType;
import com.johnny.hm.mapper.RoomTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RoomTypeService {
    @Autowired
    RoomTypeMapper roomTypeMapper;
    public List<RoomType> getRoomType() {
        return roomTypeMapper.getRoomType(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    public int postRoomType(RoomType roomType) {
        roomType.setHotelId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        return roomTypeMapper.insert(roomType);
    }

    public int putRoomType(RoomType roomType) {
        roomType.setCreateDate(new Date());
        return roomTypeMapper.updateRoomType(roomType);
    }

    public int delRoomType(Integer[] ids) {
        return roomTypeMapper.delRoomType(ids);
    }
}
