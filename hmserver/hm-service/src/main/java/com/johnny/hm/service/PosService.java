package com.johnny.hm.service;

import com.johnny.hm.bean.Position;
import com.johnny.hm.mapper.PositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosService {
    @Autowired
    PositionMapper positionMapper;

    public List<Position> getPos() {
        return positionMapper.getAllPosition();
    }

    public int postPos(Position position) {
        return positionMapper.insert(position);
    }

    public int putPos(Position position) {
        return positionMapper.updateByPrimaryKey(position);
    }

    public int delPos(Integer[] ids) {
        return positionMapper.deleteByIds(ids);
    }
}
