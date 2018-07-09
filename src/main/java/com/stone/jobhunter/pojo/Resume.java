package com.stone.jobhunter.pojo;

import java.util.Date;

public class Resume {
    private Integer id;

    private Integer userId;

    private String resumeName;

    private String evaluationId;

    private Date createTime;

    private Date updateTime;

    private Integer state;

    private String userName;

    private String userPhone;

    private String userCard;

    private String userPhoto;

    private String userGender;

    private Integer userAge;

    private String userEmail;

    private String adress;

    private String highEducation;

    private String hobby;

    public Resume(Integer id, Integer userId, String resumeName, String evaluationId, Date createTime, Date updateTime, Integer state, String userName, String userPhone, String userCard, String userPhoto, String userGender, Integer userAge, String userEmail, String adress, String highEducation, String hobby) {
        this.id = id;
        this.userId = userId;
        this.resumeName = resumeName;
        this.evaluationId = evaluationId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userCard = userCard;
        this.userPhoto = userPhoto;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.adress = adress;
        this.highEducation = highEducation;
        this.hobby = hobby;
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

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName == null ? null : resumeName.trim();
    }

    public String getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId == null ? null : evaluationId.trim();
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

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard == null ? null : userCard.trim();
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

    public String getHighEducation() {
        return highEducation;
    }

    public void setHighEducation(String highEducation) {
        this.highEducation = highEducation == null ? null : highEducation.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }
}