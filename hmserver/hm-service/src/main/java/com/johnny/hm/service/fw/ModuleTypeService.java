package com.johnny.hm.service.fw;

import com.johnny.hm.bean.ModuleType;
import com.johnny.hm.mapper.ModuleTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleTypeService {
    @Autowired
    ModuleTypeMapper moduleTypeMapper;
    public List<ModuleType> getModule() {
        return moduleTypeMapper.getModule();
    }

    public int putModule(ModuleType moduleType) {
        return moduleTypeMapper.updateByPrimaryKey(moduleType);
    }

    public int postModule(ModuleType moduleType) {
        return moduleTypeMapper.insert(moduleType);
    }

    public int delModule(Integer[] ids) {
        return moduleTypeMapper.delByIds(ids);
    }
}
