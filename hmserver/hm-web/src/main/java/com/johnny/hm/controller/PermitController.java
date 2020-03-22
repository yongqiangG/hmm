package com.johnny.hm.controller;

import com.johnny.hm.bean.Menu;
import com.johnny.hm.bean.Role;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.MenuService;
import com.johnny.hm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/per")
public class PermitController {
    @Autowired
    RoleService roleService;
    @Autowired
    MenuService menuService;
    //获取所有的Roles
    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }
    //获取菜单层级Json串
    @GetMapping("/menus")
    public List<Menu> getAllMenuWithChildren(){
        return menuService.getAllMenusWithChildren();
    }
    //根据role获取有操作全选的menu
    @GetMapping("/m/{rid}")
    public Integer[] getMidByRid(@PathVariable Integer rid){
        return menuService.getMidByRid(rid);
    }
    //根据role更新可操作的menu
    @PutMapping("/")
    public RespBean updateMenuByRoleId(Integer rid,Integer[] mids){
        if(menuService.updateMenuByRoleId(rid,mids)==mids.length){
            return RespBean.ok("修改成功");
        }
        return RespBean.err("修改失败");
    }
    //添加角色
    @PostMapping("/")
    public RespBean postRole(@RequestBody Role role){
        if(!role.getName().startsWith("ROLE_")){
            return RespBean.err("添加失败,非法的名称");
        }
        if(roleService.postRole(role)==1){
            return RespBean.ok("添加成功");
        }
        return RespBean.err("添加失败");
    }
    //根据role Id删除角色
    @DeleteMapping("/{rid}")
    public RespBean delRole(@PathVariable Integer rid){
        if(roleService.delRole(rid)==1){
            return RespBean.ok("删除成功");
        }
        return RespBean.err("删除失败");
    }
}
