package com.johnny.hm.controller;

import com.johnny.hm.bean.Hr;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.HrService;
import com.johnny.hm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/hr")
public class HrController {
    @Autowired
    HrService hrService;
    @Autowired
    RoleService roleService;
    //获取全部登录角色,除自己
    @GetMapping("/")
    public List<Hr> getAllHrs(){
        return hrService.getAllHrs();
    }
    @PutMapping("/role")
    public RespBean updateHrRole(Integer hrid, Integer[] rids) {
        if (hrService.updateHrRole(hrid, rids)) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.err("更新失败!");
    }
}
