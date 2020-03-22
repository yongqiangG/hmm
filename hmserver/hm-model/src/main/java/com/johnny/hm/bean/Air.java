package com.johnny.hm.bean;

import java.util.Date;

public class Air {
    private Integer id;

    private Integer airNo;

    private String airName;

    private Integer roomTypeId;
    private Integer airStrategyId;

    private Date createTime;

    private Date updateTime;

    private AirStrategy airStrategy;
    private RoomType roomType;

    public AirStrategy getAirStrategy() {
        return airStrategy;
    }

    public void setAirStrategy(AirStrategy airStrategy) {
        this.airStrategy = airStrategy;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAirStrategyId() {
        return airStrategyId;
    }

    public void setAirStrategyId(Integer airStrategyId) {
        this.airStrategyId = airStrategyId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAirNo() {
        return airNo;
    }

    public void setAirNo(Integer airNo) {
        this.airNo = airNo;
    }

    public String getAirName() {
        return airName;
    }

    public void setAirName(String airName) {
        this.airName = airName;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
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