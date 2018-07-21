package com.stone.jobhunter.pojo;

import java.util.Date;

public class ResumeSchool {
    private Integer id;

    private Date startTime;

    private Date finishTime;

    private String school;

    private String major;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private Integer userId;

    private String degree;

    private String experience;

    private Integer sequence;

    private Integer resumeId;

    public ResumeSchool(Integer id, Date startTime, Date finishTime, String school, String major, Date createTime, Date updateTime, Integer state, Integer userId, String degree, String experience, Integer sequence, Integer resumeId) {
        this.id = id;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.school = school;
        this.major = major;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.userId = userId;
        this.degree = degree;
        this.experience = experience;
        this.sequence = sequence;
        this.resumeId = resumeId;
    }

    public ResumeSchool() {
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }
}