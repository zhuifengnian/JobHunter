package com.stone.jobhunter.vo;


import java.util.Date;

/**
 * Created by luyue on 2018/7/8
 */

public class UserEnterpriseVo {

    private Date startTime;

    private Date finishTime;

    private String enterpriseName;

    private String position;

    private String finishText;

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

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFinishText() {
        return finishText;
    }

    public void setFinishText(String finishText) {
        this.finishText = finishText;
    }
}
