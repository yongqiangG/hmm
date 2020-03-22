package com.johnny.hm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Room {
    private Integer id;

    private String roomNo;

    private String mergeStatus;

    private Integer floorId;

    private Date checkInTime;

    private String machineCode;

    private String guestName;

    private Integer roomTypeId;

    private Integer roomStatus;

    private Boolean enabled;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date createDate;

    private String ip;

    private String port;

    private Boolean isOnline;

    private Integer logicVersion;

    private Date roomStatusChangeTime;

    private Boolean airSettingSendStatus;

    private Boolean energySettingSendStatus;

    private Boolean takePowerSettingSendStatus;

    private Boolean seasonSettingSendStatus;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date expiredDate;

    private Date serverTime;

    private Integer hotelId;

    private Building building;

    private TxFloor txFloor;

    private RoomType roomType;

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public TxFloor getTxFloor() {
        return txFloor;
    }

    public void setTxFloor(TxFloor txFloor) {
        this.txFloor = txFloor;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Integer getLogicVersion() {
        return logicVersion;
    }

    public void setLogicVersion(Integer logicVersion) {
        this.logicVersion = logicVersion;
    }

    public Date getRoomStatusChangeTime() {
        return roomStatusChangeTime;
    }

    public void setRoomStatusChangeTime(Date roomStatusChangeTime) {
        this.roomStatusChangeTime = roomStatusChangeTime;
    }

    public Boolean getAirSettingSendStatus() {
        return airSettingSendStatus;
    }

    public void setAirSettingSendStatus(Boolean airSettingSendStatus) {
        this.airSettingSendStatus = airSettingSendStatus;
    }

    public Boolean getEnergySettingSendStatus() {
        return energySettingSendStatus;
    }

    public void setEnergySettingSendStatus(Boolean energySettingSendStatus) {
        this.energySettingSendStatus = energySettingSendStatus;
    }

    public Boolean getTakePowerSettingSendStatus() {
        return takePowerSettingSendStatus;
    }

    public void setTakePowerSettingSendStatus(Boolean takePowerSettingSendStatus) {
        this.takePowerSettingSendStatus = takePowerSettingSendStatus;
    }

    public Boolean getSeasonSettingSendStatus() {
        return seasonSettingSendStatus;
    }

    public void setSeasonSettingSendStatus(Boolean seasonSettingSendStatus) {
        this.seasonSettingSendStatus = seasonSettingSendStatus;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Date getServerTime() {
        return serverTime;
    }

    public void setServerTime(Date serverTime) {
        this.serverTime = serverTime;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }
}