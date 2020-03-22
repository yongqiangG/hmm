package com.johnny.hm.mapper;


import com.johnny.hm.bean.FwInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FwInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FwInfo record);

    int insertSelective(FwInfo record);

    FwInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FwInfo record);

    int updateByPrimaryKey(FwInfo record);

    int getTotal(@Param("fid") Integer fwTypeId);

    List<FwInfo> getByPage(@Param("page") Integer page, @Param("size") Integer size,@Param("fid") Integer fwTypeId);

    int addFw(FwInfo fwInfo);

    int delByIds(@Param("ids") Integer[] ids);

    List<FwInfo> getByIds(@Param("ids") Integer[] ids);
}