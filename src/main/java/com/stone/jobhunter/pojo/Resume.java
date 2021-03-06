package com.stone.jobhunter.pojo;

import java.util.Date;

public class Resume {
    private Integer id;

    private Integer userId;

    private String resumename;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private String selfAssessment;

    private String userName;

    private String userPhone;

    private String userPhoto;

    private String userGender;

    private Integer userAge;

    private String userEmail;

    private String adress;

    private Date userBirth;

    private String selfPosition;

    private String wechat;

    private String qq;

    public Resume(Integer id, Integer userId, String resumename, Date createTime, Date updateTime, Integer state, String selfAssessment, String userName, String userPhone, String userPhoto, String userGender, Integer userAge, String userEmail, String adress, Date userBirth, String selfPosition, String wechat, String qq) {
        this.id = id;
        this.userId = userId;
        this.resumename = resumename;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.selfAssessment = selfAssessment;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userPhoto = userPhoto;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.adress = adress;
        this.userBirth = userBirth;
        this.selfPosition = selfPosition;
        this.wechat = wechat;
        this.qq = qq;
    }

    public Resume() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getResumename() {
        return resumename;
    }

    public void setResumename(String resumename) {
        this.resumename = resumename == null ? null : resumename.trim();
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

    public String getSelfAssessment() {
        return selfAssessment;
    }

    public void setSelfAssessment(String selfAssessment) {
        this.selfAssessment = selfAssessment == null ? null : selfAssessment.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public String getSelfPosition() {
        return selfPosition;
    }

    public void setSelfPosition(String selfPosition) {
        this.selfPosition = selfPosition == null ? null : selfPosition.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }
}