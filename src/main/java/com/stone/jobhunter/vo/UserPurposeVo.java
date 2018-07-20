package com.stone.jobhunter.vo;


import java.util.Date;

/**
 * Created by luyue on 2018/7/8
 */

public class UserPurposeVo {


    private String company;

    private String position;

    private String department;

    private Integer userId;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
