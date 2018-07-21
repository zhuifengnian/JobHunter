package com.stone.jobhunter.pojo;

import java.util.Date;

public class Enterprise {
    private Integer id;

    private String enterpriseName;

    private String enterpriseUrl;

    private Date createTime;

    private Date updateTime;

    private String avatarurl;

    private Integer state;

    private String type;

    private Integer industry;

    public Enterprise(Integer id, String enterpriseName, String enterpriseUrl, Date createTime, Date updateTime, String avatarurl, Integer state, String type, Integer industry) {
        this.id = id;
        this.enterpriseName = enterpriseName;
        this.enterpriseUrl = enterpriseUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.avatarurl = avatarurl;
        this.state = state;
        this.type = type;
        this.industry = industry;
    }

    public Enterprise() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseUrl() {
        return enterpriseUrl;
    }

    public void setEnterpriseUrl(String enterpriseUrl) {
        this.enterpriseUrl = enterpriseUrl == null ? null : enterpriseUrl.trim();
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

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl == null ? null : avatarurl.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }
}