package com.stone.jobhunter.pojo;

import java.util.Date;

public class ResumeEvaluate {
    private Integer id;

    private String label;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    public ResumeEvaluate(Integer id, String label, Date createTime, Date updateTime, Integer state) {
        this.id = id;
        this.label = label;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
    }

    public ResumeEvaluate() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
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
}