package com.johnny.hm.mapper;

import com.johnny.hm.bean.Menu;

import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusById(Integer hrId);

    List<Menu> getAllMenusWithRole();

    List<Menu> getAllMenusWithChildren();


}