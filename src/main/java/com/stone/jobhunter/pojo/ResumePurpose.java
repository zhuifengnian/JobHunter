package com.stone.jobhunter.pojo;

import java.util.Date;

public class ResumePurpose {
    private Integer id;

    private String company;

    private String position;

    private String department;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private Integer userId;

    private Integer sequence;

    public ResumePurpose(Integer id, String company, String position, String department, Date createTime, Date updateTime, Integer state, Integer userId, Integer sequence) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.department = department;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.userId = userId;
        this.sequence = sequence;
    }

    public ResumePurpose() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
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

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}