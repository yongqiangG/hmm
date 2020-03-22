package com.johnny.hm.mapper;

import com.johnny.hm.bean.JObLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JObLevelMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(JObLevel record);

    int insertSelective(JObLevel record);

    JObLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JObLevel record);

    int updateByPrimaryKey(JObLevel record);

    List<JObLevel> getAllJobLevel();

    int postJobLevel(JObLevel jObLevel);

    int putJobLevel(JObLevel jObLevel);

    int delJobLevel(@Param("ids") Integer[] ids);
}