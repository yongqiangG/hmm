package com.johnny.hm.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class RoomType {
    private Integer id;

    private String name;

    private Integer air1;

    private Integer air2;

    private Integer air3;

    private Integer air4;

    private Integer air5;

    private Integer air6;

    private Integer air7;

    private Integer air8;

    private Integer tv1;

    private Integer tv2;

    private Integer tv3;

    private Integer tv4;

    private Integer tv5;

    private Integer tv6;

    private Integer tv7;

    private Integer tv8;

    private Integer safeTimeout;

    private Integer cardTimeout;

    private Integer openDoorTimeout;

    private Integer airStatus;

    private Date logicCloudUpdateTime;

    private Integer logicVersion;

    private Integer serverAllowAir;

    private Integer serverAllowPower;
    //0:有线终端,1:无线终端
    private Integer isWireless;

    private Integer wirelessLogicVersion;

    private Integer startTime1;

    private Integer endTime1;

    private Integer startTime2;

    private Integer endTime2;

    private Integer startTime3;

    private Integer endTime3;

    private Integer startTime4;

    private Integer endTime4;

    private Integer nightStartHour;

    private Integer nightStartMin;

    private Integer nightEndHour;

    private Integer nightEndMin;

    private Integer hotelId;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date createDate;

    private List<Air> airs;

    public List<Air> getAirs() {
        return airs;
    }

    public void setAirs(List<Air> airs) {
        this.airs = airs;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public Integer getAir1() {
        return air1;
    }

    public void setAir1(Integer air1) {
        this.air1 = air1;
    }

    public Integer getAir2() {
        return air2;
    }

    public void setAir2(Integer air2) {
        this.air2 = air2;
    }

    public Integer getAir3() {
        return air3;
    }

    public void setAir3(Integer air3) {
        this.air3 = air3;
    }

    public Integer getAir4() {
        return air4;
    }

    public void setAir4(Integer air4) {
        this.air4 = air4;
    }

    public Integer getAir5() {
        return air5;
    }

    public void setAir5(Integer air5) {
        this.air5 = air5;
    }

    public Integer getAir6() {
        return air6;
    }

    public void setAir6(Integer air6) {
        this.air6 = air6;
    }

    public Integer getAir7() {
        return air7;
    }

    public void setAir7(Integer air7) {
        this.air7 = air7;
    }

    public Integer getAir8() {
        return air8;
    }

    public void setAir8(Integer air8) {
        this.air8 = air8;
    }

    public Integer getTv1() {
        return tv1;
    }

    public void setTv1(Integer tv1) {
        this.tv1 = tv1;
    }

    public Integer getTv2() {
        return tv2;
    }

    public void setTv2(Integer tv2) {
        this.tv2 = tv2;
    }

    public Integer getTv3() {
        return tv3;
    }

    public void setTv3(Integer tv3) {
        this.tv3 = tv3;
    }

    public Integer getTv4() {
        return tv4;
    }

    public void setTv4(Integer tv4) {
        this.tv4 = tv4;
    }

    public Integer getTv5() {
        return tv5;
    }

    public void setTv5(Integer tv5) {
        this.tv5 = tv5;
    }

    public Integer getTv6() {
        return tv6;
    }

    public void setTv6(Integer tv6) {
        this.tv6 = tv6;
    }

    public Integer getTv7() {
        return tv7;
    }

    public void setTv7(Integer tv7) {
        this.tv7 = tv7;
    }

    public Integer getTv8() {
        return tv8;
    }

    public void setTv8(Integer tv8) {
        this.tv8 = tv8;
    }

    public Integer getSafeTimeout() {
        return safeTimeout;
    }

    public void setSafeTimeout(Integer safeTimeout) {
        this.safeTimeout = safeTimeout;
    }

    public Integer getCardTimeout() {
        return cardTimeout;
    }

    public void setCardTimeout(Integer cardTimeout) {
        this.cardTimeout = cardTimeout;
    }

    public Integer getOpenDoorTimeout() {
        return openDoorTimeout;
    }

    public void setOpenDoorTimeout(Integer openDoorTimeout) {
        this.openDoorTimeout = openDoorTimeout;
    }

    public Integer getAirStatus() {
        return airStatus;
    }

    public void setAirStatus(Integer airStatus) {
        this.airStatus = airStatus;
    }

    public Date getLogicCloudUpdateTime() {
        return logicCloudUpdateTime;
    }

    public void setLogicCloudUpdateTime(Date logicCloudUpdateTime) {
        this.logicCloudUpdateTime = logicCloudUpdateTime;
    }

    public Integer getLogicVersion() {
        return logicVersion;
    }

    public void setLogicVersion(Integer logicVersion) {
        this.logicVersion = logicVersion;
    }

    public Integer getServerAllowAir() {
        return serverAllowAir;
    }

    public void setServerAllowAir(Integer serverAllowAir) {
        this.serverAllowAir = serverAllowAir;
    }

    public Integer getServerAllowPower() {
        return serverAllowPower;
    }

    public void setServerAllowPower(Integer serverAllowPower) {
        this.serverAllowPower = serverAllowPower;
    }

    public Integer getIsWireless() {
        return isWireless;
    }

    public void setIsWireless(Integer isWireless) {
        this.isWireless = isWireless;
    }

    public Integer getWirelessLogicVersion() {
        return wirelessLogicVersion;
    }

    public void setWirelessLogicVersion(Integer wirelessLogicVersion) {
        this.wirelessLogicVersion = wirelessLogicVersion;
    }

    public Integer getStartTime1() {
        return startTime1;
    }

    public void setStartTime1(Integer startTime1) {
        this.startTime1 = startTime1;
    }

    public Integer getEndTime1() {
        return endTime1;
    }

    public void setEndTime1(Integer endTime1) {
        this.endTime1 = endTime1;
    }

    public Integer getStartTime2() {
        return startTime2;
    }

    public void setStartTime2(Integer startTime2) {
        this.startTime2 = startTime2;
    }

    public Integer getEndTime2() {
        return endTime2;
    }

    public void setEndTime2(Integer endTime2) {
        this.endTime2 = endTime2;
    }

    public Integer getStartTime3() {
        return startTime3;
    }

    public void setStartTime3(Integer startTime3) {
        this.startTime3 = startTime3;
    }

    public Integer getEndTime3() {
        return endTime3;
    }

    public void setEndTime3(Integer endTime3) {
        this.endTime3 = endTime3;
    }

    public Integer getStartTime4() {
        return startTime4;
    }

    public void setStartTime4(Integer startTime4) {
        this.startTime4 = startTime4;
    }

    public Integer getEndTime4() {
        return endTime4;
    }

    public void setEndTime4(Integer endTime4) {
        this.endTime4 = endTime4;
    }

    public Integer getNightStartHour() {
        return nightStartHour;
    }

    public void setNightStartHour(Integer nightStartHour) {
        this.nightStartHour = nightStartHour;
    }

    public Integer getNightStartMin() {
        return nightStartMin;
    }

    public void setNightStartMin(Integer nightStartMin) {
        this.nightStartMin = nightStartMin;
    }

    public Integer getNightEndHour() {
        return nightEndHour;
    }

    public void setNightEndHour(Integer nightEndHour) {
        this.nightEndHour = nightEndHour;
    }

    public Integer getNightEndMin() {
        return nightEndMin;
    }

    public void setNightEndMin(Integer nightEndMin) {
        this.nightEndMin = nightEndMin;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }
}