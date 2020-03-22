package com.johnny.hm.mapper;


import com.johnny.hm.bean.FwModule;
import org.apache.ibatis.annotations.Param;

public interface FwModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FwModule record);

    int insertSelective(FwModule record);

    FwModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FwModule record);

    int updateByPrimaryKey(FwModule record);

    int addModule(@Param("fid") Integer fid, @Param("mids") Integer[] mids);

    int delByFid(Integer fid);
}