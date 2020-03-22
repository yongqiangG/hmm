package com.johnny.hm.config;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 判断当前角色是否具备请求角色
 */
@Component
public class CustomUrlDecisionManager implements AccessDecisionManager {
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
        //遍历请求所需要的角色
        for (ConfigAttribute configAttribute : collection) {
            String needRole = configAttribute.getAttribute();
            if("ROLE_LOGIN".equals(needRole)){
                //如果没有请求匹配上,需要登录
                if(authentication instanceof AnonymousAuthenticationToken){
                    //当前登陆者是匿名用户
                    throw new AccessDeniedException("请先登录");
                }else{
                    //已登录,合法请求,放行
                    return;
                }
            }
            //登录状态且匹配上请求
            //获取当前用户所具备的角色
            Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
            for (GrantedAuthority authority : authorities) {
                //当前所具备角色符合请求所需要的任一角色,即可
                if(authority.getAuthority().equals(needRole)){
                    return;
                }
            }
        }
        //登录但不具备所需角色
        throw new AccessDeniedException("权限不足,请联系管理员");
    }

    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    public boolean supports(Class<?> aClass) {
        return true;
    }
}
