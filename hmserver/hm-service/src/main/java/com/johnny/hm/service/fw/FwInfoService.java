package com.johnny.hm.service.fw;

import com.johnny.hm.bean.FwInfo;
import com.johnny.hm.mapper.FwInfoMapper;
import com.johnny.hm.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.HashMap;
import java.util.List;

@Service
public class FwInfoService {
    @Autowired
    FwInfoMapper fwInfoMapper;

    public RespBean getByPage(Integer page, Integer size, Integer fwTypeId) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        int total = fwInfoMapper.getTotal(fwTypeId);
        List<FwInfo> data = fwInfoMapper.getByPage(page,size,fwTypeId);
        RespBean respBean = new RespBean();
        HashMap<String, Object> m = new HashMap<>();
        m.put("total",total);
        m.put("data",data);
        respBean.setObj(m);
        return respBean;
    }

    public int addFw(FwInfo fwInfo) {
        return fwInfoMapper.addFw(fwInfo);
    }

    public int putFwInfo(FwInfo fwInfo) {
        return fwInfoMapper.updateByPrimaryKey(fwInfo);
    }

    public int delByIds(Integer[] ids) {
        //删除文件
        List<FwInfo> list= fwInfoMapper.getByIds(ids);
        for (FwInfo fwInfo : list) {
            if(fwInfo.getFwPath()!=""&& fwInfo.getFwPath()!=null){
                File file = new File(fwInfo.getFwPath());
                file.delete();
            }
        }
        return fwInfoMapper.delByIds(ids);
    }

    public FwInfo getById(Integer fid) {
        return fwInfoMapper.selectByPrimaryKey(fid);
    }
}
