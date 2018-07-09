package com.stone.jobhunter.vo;


import java.util.Date;

/**
 * Created by luyue on 2018/7/8
 */

public class UserScienceVo {



    private Date startTime;

    private Date finishTime;

    private String scienceName;

    private String scienceText;

    private String myTask;

    private String address;

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

    public String getScienceName() {
        return scienceName;
    }

    public void setScienceName(String scienceName) {
        this.scienceName = scienceName;
    }

    public String getScienceText() {
        return scienceText;
    }

    public void setScienceText(String scienceText) {
        this.scienceText = scienceText;
    }

    public String getMyTask() {
        return myTask;
    }

    public void setMyTask(String myTask) {
        this.myTask = myTask;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFinishText() {
        return finishText;
    }

    public void setFinishText(String finishText) {
        this.finishText = finishText;
    }
}
