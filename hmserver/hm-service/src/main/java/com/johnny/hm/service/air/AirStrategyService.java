package com.johnny.hm.service.air;

import com.johnny.hm.bean.AirStrategy;
import com.johnny.hm.bean.Hr;
import com.johnny.hm.mapper.AirStrategyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirStrategyService {
    @Autowired
    AirStrategyMapper airStrategyMapper;

    public List<AirStrategy> getStrategy() {
        int hotelId = ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        return airStrategyMapper.getStrategy(hotelId);
    }

    public int putStrategy(AirStrategy airStrategy) {
        return airStrategyMapper.updateByPrimaryKey(airStrategy);
    }

    public int postStrategy(AirStrategy airStrategy) {
        airStrategy.setHotelId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        return airStrategyMapper.insert(airStrategy);
    }

    public int delStrategy(Integer[] ids) {
        return airStrategyMapper.delByIds(ids);
    }
}
