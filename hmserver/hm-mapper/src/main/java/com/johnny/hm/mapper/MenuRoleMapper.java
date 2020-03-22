package com.johnny.hm.mapper;

import com.johnny.hm.bean.MenuRole;
import org.apache.ibatis.annotations.Param;

public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);

    Integer[] getMidByRid(Integer rid);

    int delMidByRid(Integer rid);

    Integer addMenus(@Param("rid") Integer rid, @Param("mids")Integer[] mid);
}