package com.titular.myblog.pojo;

import java.util.Date;

public class Dynamic {
    private Integer dynamicId;

    private Integer userId;

    private Date dynamicTime;

    private String dynamicIp;

    private String dynamicContent;

    private Byte typeId;

    public Integer getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(Integer dynamicId) {
        this.dynamicId = dynamicId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getDynamicTime() {
        return dynamicTime;
    }

    public void setDynamicTime(Date dynamicTime) {
        this.dynamicTime = dynamicTime;
    }

    public String getDynamicIp() {
        return dynamicIp;
    }

    public void setDynamicIp(String dynamicIp) {
        this.dynamicIp = dynamicIp == null ? null : dynamicIp.trim();
    }

    public String getDynamicContent() {
        return dynamicContent;
    }

    public void setDynamicContent(String dynamicContent) {
        this.dynamicContent = dynamicContent == null ? null : dynamicContent.trim();
    }

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }
}