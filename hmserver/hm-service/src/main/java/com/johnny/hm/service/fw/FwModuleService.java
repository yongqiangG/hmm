package com.johnny.hm.service.fw;

import com.johnny.hm.mapper.FwModuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FwModuleService {
    @Autowired
    FwModuleMapper fwModuleMapper;

    @Transactional
    public int putModule(Integer fid, Integer[] mids) {
        fwModuleMapper.delByFid(fid);
        int result=0;
        if(mids!=null){
            result = fwModuleMapper.addModule(fid, mids);
            return result;
        }
        return result;
    }
}
