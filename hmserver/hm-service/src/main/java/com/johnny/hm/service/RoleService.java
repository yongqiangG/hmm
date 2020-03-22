package com.johnny.hm.service;

import com.johnny.hm.bean.Role;
import com.johnny.hm.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    public int delRole(Integer rid) {
        return roleMapper.deleteByPrimaryKey(rid);
    }

    public int postRole(Role role) {
        return roleMapper.insert(role);
    }
}
