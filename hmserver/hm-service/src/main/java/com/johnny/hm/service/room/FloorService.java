package com.johnny.hm.service.room;

import com.johnny.hm.bean.Hr;
import com.johnny.hm.bean.TxFloor;
import com.johnny.hm.mapper.TxFloorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FloorService {
    @Autowired
    TxFloorMapper txFloorMapper;
    public List<TxFloor> getFloor() {
        return txFloorMapper.getFloor(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    public int postFloor(TxFloor txFloor) {
        return txFloorMapper.insert(txFloor);
    }

    public int putFloor(TxFloor txFloor) {
        txFloor.setCreateDate(new Date());
        return txFloorMapper.updateByPrimaryKey(txFloor);
    }

    public int delFloor(Integer[] ids) {
        return txFloorMapper.delFloor(ids);
    }
}
