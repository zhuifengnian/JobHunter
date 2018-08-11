package com.stone.jobhunter.pojo;

import java.util.Date;

public class ResumeCertificate {
    private Integer id;

    private String name;

    private String grade;

    private Integer resumeId;

    private Integer userId;

    private Integer state;

    private Date createTime;

    private Date updateTime;

    public ResumeCertificate(Integer id, String name, String grade, Integer resumeId, Integer userId, Integer state, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.resumeId = resumeId;
        this.userId = userId;
        this.state = state;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ResumeCertificate() {
        super();
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
        this.name = name == null ? null : name.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
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
}