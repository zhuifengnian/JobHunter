package com.stone.jobhunter.pojo;

import java.util.Date;

public class ResumeScience {
    private Integer id;

    private Integer resumeId;

    private Date startTime;

    private Date finishTime;

    private String scienceName;

    private String scienceText;

    private String myTask;

    private String address;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private String finishText;

    private Integer userId;

    public ResumeScience(Integer id, Integer resumeId, Date startTime, Date finishTime, String scienceName, String scienceText, String myTask, String address, Date createTime, Date updateTime, Integer state, String finishText, Integer userId) {
        this.id = id;
        this.resumeId = resumeId;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.scienceName = scienceName;
        this.scienceText = scienceText;
        this.myTask = myTask;
        this.address = address;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.finishText = finishText;
        this.userId = userId;
    }

    public ResumeScience() {
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

    public String getScienceName() {
        return scienceName;
    }

    public void setScienceName(String scienceName) {
        this.scienceName = scienceName == null ? null : scienceName.trim();
    }

    public String getScienceText() {
        return scienceText;
    }

    public void setScienceText(String scienceText) {
        this.scienceText = scienceText == null ? null : scienceText.trim();
    }

    public String getMyTask() {
        return myTask;
    }

    public void setMyTask(String myTask) {
        this.myTask = myTask == null ? null : myTask.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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