package com.stone.jobhunter.pojo;

import java.util.Date;

public class Our {
    private Integer id;

    private String logo;

    private Date createTime;

    private Date updateTime;

    private String picture;

    private String text;

    public Our(Integer id, String logo, Date createTime, Date updateTime, String picture, String text) {
        this.id = id;
        this.logo = logo;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.picture = picture;
        this.text = text;
    }

    public Our() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}