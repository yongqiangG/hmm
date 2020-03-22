package com.johnny.hm.service;

import com.johnny.hm.bean.Department;
import com.johnny.hm.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    public List<Department> getDepTree(Integer parentId) {
        return departmentMapper.getDepTree(parentId);
    }

    public void addDep(Department dep) {
        dep.setEnabled(true);
        departmentMapper.addDep(dep);
    }

    public void delDep(Department dep) {
        departmentMapper.delDep(dep);
    }
}
