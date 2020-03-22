package com.johnny.hm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class FwInfo {
    private Integer id;

    private String name;

    private Integer fwTypeId;

    private String fwPath;

    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date createTime;

    private Date updateTime;

    private FwType fwType;

    public FwType getFwType() {
        return fwType;
    }

    public void setFwType(FwType fwType) {
        this.fwType = fwType;
    }

    private List<ModuleType> moduleTypes;

    public List<ModuleType> getModuleTypes() {
        return moduleTypes;
    }

    public void setModuleTypes(List<ModuleType> moduleTypes) {
        this.moduleTypes = moduleTypes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFwTypeId() {
        return fwTypeId;
    }

    public void setFwTypeId(Integer fwTypeId) {
        this.fwTypeId = fwTypeId;
    }

    public String getFwPath() {
        return fwPath;
    }

    public void setFwPath(String fwPath) {
        this.fwPath = fwPath;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}