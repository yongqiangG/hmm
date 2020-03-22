package com.johnny.hm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class AirStrategy {
    private Integer id;

    private Integer hotelId;

    private String name;

    private Float tempCorrect;

    private Integer lowRunning;

    private Integer emptyPowerAllow;

    private Integer emptyControl;

    private Integer emptyCycleTime;

    private Float emptySummerTemp;

    private Float emptyWinterTemp;

    private Integer emptySpeed;

    private Integer emptyMode;

    private Integer emptySwitch;

    private Integer checkinControl;

    private Integer checkinCycleTime;

    private Float checkinSummerTemp;

    private Float checkinWinterTemp;

    private Integer checkinSpeed;

    private Integer checkinMode;

    private Integer checkinSwitch;

    private Integer cardoutControl;

    private Integer cardoutCycleTime;

    private Float cardoutSummerTemp;

    private Float cardoutWinterTemp;

    private Integer cardoutSpeed;

    private Integer cardoutMode;

    private Integer cardoutSwitch;

    private Integer remoteControl;

    private Integer remoteTime;

    private Float cardinSummerTemp;

    private Float cardinWinterTemp;

    private Integer cardinSpeed;

    private Integer cardinMode;

    private Integer cardinSwitch;

    private Integer sleepModeSwitch;

    private Date sleepModeStartTime;

    private Date sleepModeEndTime;

    private Integer sleepModeTemp;

    private Integer sleepModeAirSwitch;

    private Integer serverPowerAllow;

    private Integer serverAirAllow;

    private Integer enabled;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date createTime;

    private Date updateTime;

    private Integer createUser;

    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getTempCorrect() {
        return tempCorrect;
    }

    public void setTempCorrect(Float tempCorrect) {
        this.tempCorrect = tempCorrect;
    }

    public Integer getLowRunning() {
        return lowRunning;
    }

    public void setLowRunning(Integer lowRunning) {
        this.lowRunning = lowRunning;
    }

    public Integer getEmptyPowerAllow() {
        return emptyPowerAllow;
    }

    public void setEmptyPowerAllow(Integer emptyPowerAllow) {
        this.emptyPowerAllow = emptyPowerAllow;
    }

    public Integer getEmptyControl() {
        return emptyControl;
    }

    public void setEmptyControl(Integer emptyControl) {
        this.emptyControl = emptyControl;
    }

    public Integer getEmptyCycleTime() {
        return emptyCycleTime;
    }

    public void setEmptyCycleTime(Integer emptyCycleTime) {
        this.emptyCycleTime = emptyCycleTime;
    }

    public Float getEmptySummerTemp() {
        return emptySummerTemp;
    }

    public void setEmptySummerTemp(Float emptySummerTemp) {
        this.emptySummerTemp = emptySummerTemp;
    }

    public Float getEmptyWinterTemp() {
        return emptyWinterTemp;
    }

    public void setEmptyWinterTemp(Float emptyWinterTemp) {
        this.emptyWinterTemp = emptyWinterTemp;
    }

    public Integer getEmptySpeed() {
        return emptySpeed;
    }

    public void setEmptySpeed(Integer emptySpeed) {
        this.emptySpeed = emptySpeed;
    }

    public Integer getEmptyMode() {
        return emptyMode;
    }

    public void setEmptyMode(Integer emptyMode) {
        this.emptyMode = emptyMode;
    }

    public Integer getEmptySwitch() {
        return emptySwitch;
    }

    public void setEmptySwitch(Integer emptySwitch) {
        this.emptySwitch = emptySwitch;
    }

    public Integer getCheckinControl() {
        return checkinControl;
    }

    public void setCheckinControl(Integer checkinControl) {
        this.checkinControl = checkinControl;
    }

    public Integer getCheckinCycleTime() {
        return checkinCycleTime;
    }

    public void setCheckinCycleTime(Integer checkinCycleTime) {
        this.checkinCycleTime = checkinCycleTime;
    }

    public Float getCheckinSummerTemp() {
        return checkinSummerTemp;
    }

    public void setCheckinSummerTemp(Float checkinSummerTemp) {
        this.checkinSummerTemp = checkinSummerTemp;
    }

    public Float getCheckinWinterTemp() {
        return checkinWinterTemp;
    }

    public void setCheckinWinterTemp(Float checkinWinterTemp) {
        this.checkinWinterTemp = checkinWinterTemp;
    }

    public Integer getCheckinSpeed() {
        return checkinSpeed;
    }

    public void setCheckinSpeed(Integer checkinSpeed) {
        this.checkinSpeed = checkinSpeed;
    }

    public Integer getCheckinMode() {
        return checkinMode;
    }

    public void setCheckinMode(Integer checkinMode) {
        this.checkinMode = checkinMode;
    }

    public Integer getCheckinSwitch() {
        return checkinSwitch;
    }

    public void setCheckinSwitch(Integer checkinSwitch) {
        this.checkinSwitch = checkinSwitch;
    }

    public Integer getCardoutControl() {
        return cardoutControl;
    }

    public void setCardoutControl(Integer cardoutControl) {
        this.cardoutControl = cardoutControl;
    }

    public Integer getCardoutCycleTime() {
        return cardoutCycleTime;
    }

    public void setCardoutCycleTime(Integer cardoutCycleTime) {
        this.cardoutCycleTime = cardoutCycleTime;
    }

    public Float getCardoutSummerTemp() {
        return cardoutSummerTemp;
    }

    public void setCardoutSummerTemp(Float cardoutSummerTemp) {
        this.cardoutSummerTemp = cardoutSummerTemp;
    }

    public Float getCardoutWinterTemp() {
        return cardoutWinterTemp;
    }

    public void setCardoutWinterTemp(Float cardoutWinterTemp) {
        this.cardoutWinterTemp = cardoutWinterTemp;
    }

    public Integer getCardoutSpeed() {
        return cardoutSpeed;
    }

    public void setCardoutSpeed(Integer cardoutSpeed) {
        this.cardoutSpeed = cardoutSpeed;
    }

    public Integer getCardoutMode() {
        return cardoutMode;
    }

    public void setCardoutMode(Integer cardoutMode) {
        this.cardoutMode = cardoutMode;
    }

    public Integer getCardoutSwitch() {
        return cardoutSwitch;
    }

    public void setCardoutSwitch(Integer cardoutSwitch) {
        this.cardoutSwitch = cardoutSwitch;
    }

    public Integer getRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(Integer remoteControl) {
        this.remoteControl = remoteControl;
    }

    public Integer getRemoteTime() {
        return remoteTime;
    }

    public void setRemoteTime(Integer remoteTime) {
        this.remoteTime = remoteTime;
    }

    public Float getCardinSummerTemp() {
        return cardinSummerTemp;
    }

    public void setCardinSummerTemp(Float cardinSummerTemp) {
        this.cardinSummerTemp = cardinSummerTemp;
    }

    public Float getCardinWinterTemp() {
        return cardinWinterTemp;
    }

    public void setCardinWinterTemp(Float cardinWinterTemp) {
        this.cardinWinterTemp = cardinWinterTemp;
    }

    public Integer getCardinSpeed() {
        return cardinSpeed;
    }

    public void setCardinSpeed(Integer cardinSpeed) {
        this.cardinSpeed = cardinSpeed;
    }

    public Integer getCardinMode() {
        return cardinMode;
    }

    public void setCardinMode(Integer cardinMode) {
        this.cardinMode = cardinMode;
    }

    public Integer getCardinSwitch() {
        return cardinSwitch;
    }

    public void setCardinSwitch(Integer cardinSwitch) {
        this.cardinSwitch = cardinSwitch;
    }

    public Integer getSleepModeSwitch() {
        return sleepModeSwitch;
    }

    public void setSleepModeSwitch(Integer sleepModeSwitch) {
        this.sleepModeSwitch = sleepModeSwitch;
    }

    public Date getSleepModeStartTime() {
        return sleepModeStartTime;
    }

    public void setSleepModeStartTime(Date sleepModeStartTime) {
        this.sleepModeStartTime = sleepModeStartTime;
    }

    public Date getSleepModeEndTime() {
        return sleepModeEndTime;
    }

    public void setSleepModeEndTime(Date sleepModeEndTime) {
        this.sleepModeEndTime = sleepModeEndTime;
    }

    public Integer getSleepModeTemp() {
        return sleepModeTemp;
    }

    public void setSleepModeTemp(Integer sleepModeTemp) {
        this.sleepModeTemp = sleepModeTemp;
    }

    public Integer getSleepModeAirSwitch() {
        return sleepModeAirSwitch;
    }

    public void setSleepModeAirSwitch(Integer sleepModeAirSwitch) {
        this.sleepModeAirSwitch = sleepModeAirSwitch;
    }

    public Integer getServerPowerAllow() {
        return serverPowerAllow;
    }

    public void setServerPowerAllow(Integer serverPowerAllow) {
        this.serverPowerAllow = serverPowerAllow;
    }

    public Integer getServerAirAllow() {
        return serverAirAllow;
    }

    public void setServerAirAllow(Integer serverAirAllow) {
        this.serverAirAllow = serverAirAllow;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
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

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}