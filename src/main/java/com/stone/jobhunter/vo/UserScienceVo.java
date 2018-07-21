package com.stone.jobhunter.vo;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luyue on 2018/7/8
 */

public class UserScienceVo {

    private Date startTime;

    private Date finishTime;

    private String scienceName;

    private String scienceText;

    private String context;

    private Integer userId;


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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
