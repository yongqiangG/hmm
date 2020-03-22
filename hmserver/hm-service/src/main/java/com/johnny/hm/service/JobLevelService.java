package com.johnny.hm.service;

import com.johnny.hm.bean.JObLevel;
import com.johnny.hm.mapper.JObLevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobLevelService {
    @Autowired
    JObLevelMapper jObLevelMapper;

    public List<JObLevel> getAllJobLevel() {
        return jObLevelMapper.getAllJobLevel();
    }

    public int postJobLevel(JObLevel jObLevel) {
        return jObLevelMapper.postJobLevel(jObLevel);
    }

    public int putJobLevel(JObLevel jObLevel) {
        return jObLevelMapper.putJobLevel(jObLevel);
    }

    public int delJobLevel(Integer[] ids) {
        return jObLevelMapper.delJobLevel(ids);
    }
}
