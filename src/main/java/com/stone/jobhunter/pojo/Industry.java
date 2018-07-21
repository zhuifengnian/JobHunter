package com.stone.jobhunter.pojo;

import java.util.Date;

public class Industry {
    private Integer id;

    private String industry;

    private Date createTime;

    private Date updateTime;

    public Industry(Integer id, String industry, Date createTime, Date updateTime) {
        this.id = id;
        this.industry = industry;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Industry() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
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