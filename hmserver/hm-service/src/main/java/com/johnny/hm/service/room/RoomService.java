package com.johnny.hm.service.room;

import com.johnny.hm.bean.Hr;
import com.johnny.hm.bean.Room;
import com.johnny.hm.mapper.RoomMapper;
import com.johnny.hm.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoomService {
    @Autowired
    RoomMapper roomMapper;
    public RespBean getRoom(Integer page,Integer size,String kw) {
        if(page!=null&&size!=null){
            page=(page-1)*size;
        }
        int hotelId=((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        int total=roomMapper.getTotal(hotelId,kw);
        List<Room> data = roomMapper.getRoom(hotelId,page,size,kw);
        RespBean resp = new RespBean();
        Map m = new HashMap<String,Object>();
        m.put("total",total);
        m.put("data",data);
        resp.setObj(m);
        return resp;
    }

    public int postRoom(Room room) {
        room.setHotelId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        return roomMapper.insert(room);
    }

    public int putRoom(Room room){
        room.setCreateDate(new Date());
        return roomMapper.updateRoom(room);
    }

    public int delRoom(Integer[] ids){
        return roomMapper.delRoom(ids);
    }

    public List<Room> getRoomByRid(Integer rid) {
        return roomMapper.getRoomByRid(rid);
    }
}
