package com.stone.jobhunter.pojo;

import java.util.Date;

public class ResumeSchool {
    private Integer id;

    private Integer resumeId;

    private Date startTime;

    private Date finishTime;

    private String school;

    private String major;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private String finishText;

    private Integer userId;

    public ResumeSchool(Integer id, Integer resumeId, Date startTime, Date finishTime, String school, String major, Date createTime, Date updateTime, Integer state, String finishText, Integer userId) {
        this.id = id;
        this.resumeId = resumeId;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.school = school;
        this.major = major;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.finishText = finishText;
        this.userId = userId;
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

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
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

    public String getFinishText() {
        return finishText;
    }

    public void setFinishText(String finishText) {
        this.finishText = finishText == null ? null : finishText.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}