package com.johnny.hm.service.air;

import com.johnny.hm.bean.Air;
import com.johnny.hm.bean.Hr;
import com.johnny.hm.bean.RoomType;
import com.johnny.hm.mapper.AirMapper;
import com.johnny.hm.mapper.RoomTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirService {
    @Autowired
    RoomTypeMapper roomTypeMapper;
    @Autowired
    AirMapper airMapper;

    public List<RoomType> getRoomTypeWithAir() {
        return roomTypeMapper.getRoomTypeWithAir(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    public int putAirs(List<Air> airs) {
        airMapper.deleteAirs(airs.get(0).getRoomTypeId());
        if (airs.size() == 0) {
            return 0;
        } else {
            return airMapper.putAirs(airs);
        }
    }

    public List<Air> getAirWithStrategy() {
        return airMapper.getAirWithStrategy(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    public int changeAirStrategy(Air air) {
        return airMapper.changeStrategy(air);
    }
}
