package com.stone.jobhunter.pojo;

import java.util.Date;

public class Our {
    private Integer id;

    private String text;

    private Date createTime;

    private Date updateTime;

    private String picture;

    public Our(Integer id, String text, Date createTime, Date updateTime, String picture) {
        this.id = id;
        this.text = text;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.picture = picture;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
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
}