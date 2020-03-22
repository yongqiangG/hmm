package com.johnny.hm.service;

import com.johnny.hm.bean.Hr;
import com.johnny.hm.bean.Role;
import com.johnny.hm.mapper.HrMapper;
import com.johnny.hm.mapper.HrRoleMapper;
import com.johnny.hm.utils.HrUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Autowired
    HrRoleMapper hrRoleMapper;
    @Autowired
    SessionRegistry sessionRegistry;
    private static Logger logger = getLogger(HrService.class);

    //根据用户名从数据库获取记录并映射到hr对象,可以获取到账号信息,账号角色,账号状态
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("账号不存在");
        }
        //设置用户角色
        List<Role> roles = hrMapper.getRolesById(hr.getId());
        hr.setRoles(roles);
        return hr;
    }


    public List<Hr> getAllHrs() {
        Hr currentUser = HrUtil.getCurrentUser();
        return hrMapper.getAllHrs(currentUser.getId());
    }

    public boolean updateHrRole(Integer hrid, Integer[] rids) {
        hrRoleMapper.deleteByHrid(hrid);
        return hrRoleMapper.addRole(hrid, rids) == rids.length;
    }
}
