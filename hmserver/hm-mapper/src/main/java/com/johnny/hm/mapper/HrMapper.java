package com.johnny.hm.mapper;

import com.johnny.hm.bean.Hr;
import com.johnny.hm.bean.Role;

import java.util.List;

public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);

    List<Role> getRolesById(Integer id);

    List<Hr> getAllHrs(Integer id);
}