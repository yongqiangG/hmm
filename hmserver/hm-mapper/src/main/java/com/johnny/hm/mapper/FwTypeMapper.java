package com.johnny.hm.mapper;


import com.johnny.hm.bean.FwType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FwTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FwType record);

    int insertSelective(FwType record);

    FwType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FwType record);

    int updateByPrimaryKey(FwType record);

    List<FwType> getFwType();

    int delByIds(@Param("ids") Integer[] ids);
}