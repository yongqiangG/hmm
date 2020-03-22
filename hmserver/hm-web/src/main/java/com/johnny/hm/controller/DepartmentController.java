package com.johnny.hm.controller;

import com.johnny.hm.bean.Department;
import com.johnny.hm.model.RespBean;
import com.johnny.hm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic/dep")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    //获取部门树.传入根的pid
    @GetMapping("/p/{parentId}")
    public List<Department> getDepTree(@PathVariable Integer parentId){
        return departmentService.getDepTree(parentId);
    }
    //添加部门
    @PostMapping("/")
    public RespBean addDep(@RequestBody Department dep){
        departmentService.addDep(dep);
        if(dep.getResult()==1){
            return RespBean.ok("添加成功",dep);
        }
        return RespBean.err("添加失败");
    }
    //删除部门,-2:存在子部门,-1部门下存在员工,1删除成功
    @DeleteMapping("/{id}")
    public RespBean delDep(@PathVariable Integer id){
        Department dep = new Department();
        dep.setId(id);
        departmentService.delDep(dep);
        if(dep.getResult()==-2){
            return RespBean.err("删除失败,该部门下存在子部门");
        }else if(dep.getResult()==-1){
            return RespBean.err("删除失败,该部门下存在员工");
        }else if(dep.getResult()==1){
            return RespBean.ok("删除成功",dep);
        }else{
            return RespBean.err("删除失败,异常错误");
        }
    }
}
