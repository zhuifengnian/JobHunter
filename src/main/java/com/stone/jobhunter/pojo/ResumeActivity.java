package com.stone.jobhunter.pojo;

import java.util.Date;

public class ResumeActivity {
    private Integer id;

    private Integer resumeId;

    private Date startTime;

    private Date finishTime;

    private String position;

    private String adress;

    private String activityName;

    private Date createTime;

    private Date updateTime;

    private Integer userId;

    public ResumeActivity(Integer id, Integer resumeId, Date startTime, Date finishTime, String position, String adress, String activityName, Date createTime, Date updateTime, Integer userId) {
        this.id = id;
        this.resumeId = resumeId;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.position = position;
        this.adress = adress;
        this.activityName = activityName;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.userId = userId;
    }

    public ResumeActivity() {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
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
}