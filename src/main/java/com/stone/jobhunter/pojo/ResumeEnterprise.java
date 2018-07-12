package com.stone.jobhunter.pojo;

import java.util.Date;

public class ResumeEnterprise {
    private Integer id;

    private Date startTime;

    private Date finishTime;

    private String enterpriseName;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private String position;

    private Integer userId;

    private String context;

    public ResumeEnterprise(Integer id, Date startTime, Date finishTime, String enterpriseName, Date createTime, Date updateTime, Integer state, String position, Integer userId, String context) {
        this.id = id;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.enterpriseName = enterpriseName;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.position = position;
        this.userId = userId;
        this.context = context;
    }

    public ResumeEnterprise() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}