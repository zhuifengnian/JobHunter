package com.stone.jobhunter.pojo;

import java.util.Date;

public class DeliverJob {
    private Integer id;

    private Integer enterpriseId;

    private Integer state;

    private Date createTime;

    private Date updateTime;

    private Integer userId;

    private Integer resumeId;

    private String sequence;

    public DeliverJob(Integer id, Integer enterpriseId, Integer state, Date createTime, Date updateTime, Integer userId, Integer resumeId, String sequence) {
        this.id = id;
        this.enterpriseId = enterpriseId;
        this.state = state;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.userId = userId;
        this.resumeId = resumeId;
        this.sequence = sequence;
    }

    public DeliverJob() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }
}