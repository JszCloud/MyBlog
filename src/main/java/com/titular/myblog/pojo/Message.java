package com.titular.myblog.pojo;

import java.util.Date;

public class Message {
    private Short messageId;

    private Integer userId;

    private Integer messageUserId;

    private Date messageStayTime;

    private String messageUserIp;

    private String messageContent;

    public Short getMessageId() {
        return messageId;
    }

    public void setMessageId(Short messageId) {
        this.messageId = messageId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMessageUserId() {
        return messageUserId;
    }

    public void setMessageUserId(Integer messageUserId) {
        this.messageUserId = messageUserId;
    }

    public Date getMessageStayTime() {
        return messageStayTime;
    }

    public void setMessageStayTime(Date messageStayTime) {
        this.messageStayTime = messageStayTime;
    }

    public String getMessageUserIp() {
        return messageUserIp;
    }

    public void setMessageUserIp(String messageUserIp) {
        this.messageUserIp = messageUserIp == null ? null : messageUserIp.trim();
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }
}