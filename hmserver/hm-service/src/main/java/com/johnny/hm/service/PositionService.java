package com.johnny.hm.service;

import com.johnny.hm.bean.Position;
import com.johnny.hm.mapper.PositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;
    public List<Position> getAllPosition() {
        return positionMapper.getAllPosition();
    }

    public int postPosition(Position position) {
        return positionMapper.postPosition(position);
    }

    public int updatePos(Position position) {
        return positionMapper.putPosition(position);
    }

    public int delPos(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }
}
