package com.johnny.hm.utils;

import com.johnny.hm.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

public class HrUtil {
    //返回当前登录角色
    public static Hr getCurrentUser(){
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
