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

    private String finishText;

    private Integer resumeId;

    private Integer userId;

    public ResumeEnterprise(Integer id, Date startTime, Date finishTime, String enterpriseName, Date createTime, Date updateTime, Integer state, String position, String finishText, Integer resumeId, Integer userId) {
        this.id = id;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.enterpriseName = enterpriseName;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.position = position;
        this.finishText = finishText;
        this.resumeId = resumeId;
        this.userId = userId;
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

    public String getFinishText() {
        return finishText;
    }

    public void setFinishText(String finishText) {
        this.finishText = finishText == null ? null : finishText.trim();
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}