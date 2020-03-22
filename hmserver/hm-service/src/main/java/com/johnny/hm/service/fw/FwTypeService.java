package com.johnny.hm.service.fw;

import com.johnny.hm.bean.FwType;
import com.johnny.hm.mapper.FwTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FwTypeService {
    @Autowired
    FwTypeMapper fwTypeMapper;
    public List<FwType> getFwType() {
        return fwTypeMapper.getFwType();
    }

    public int putFwType(FwType fwType) {
        return fwTypeMapper.updateByPrimaryKey(fwType);
    }

    public int postFwType(FwType fwType) {
        return fwTypeMapper.insert(fwType);
    }

    public int delByIds(Integer[] ids) {
        return fwTypeMapper.delByIds(ids);
    }
}
