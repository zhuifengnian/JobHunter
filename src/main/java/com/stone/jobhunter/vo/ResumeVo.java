package com.stone.jobhunter.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by luyue on 2018/7/8
 */

public class ResumeVo {

    private List<UserInformationVo> informationVos;

    private List<UserActivityVo> userActivityVos;

    private List<UserEnterpriseVo> userEnterpriseVos;

    private List<UserScienceVo> userScienceVos;

    private  List<UserEvaluateVo> userEvaluateVos;

    private  List<UserPurposeVo> userPurposeVos;


    public List<UserInformationVo> getInformationVos() {
        return informationVos;
    }

    public void setInformationVos(List<UserInformationVo> informationVos) {
        this.informationVos = informationVos;
    }

    public List<UserActivityVo> getUserActivityVos() {
        return userActivityVos;
    }

    public void setUserActivityVos(List<UserActivityVo> userActivityVos) {
        this.userActivityVos = userActivityVos;
    }

    public List<UserEnterpriseVo> getUserEnterpriseVos() {
        return userEnterpriseVos;
    }

    public void setUserEnterpriseVos(List<UserEnterpriseVo> userEnterpriseVos) {
        this.userEnterpriseVos = userEnterpriseVos;
    }

    public List<UserScienceVo> getUserScienceVos() {
        return userScienceVos;
    }

    public void setUserScienceVos(List<UserScienceVo> userScienceVos) {
        this.userScienceVos = userScienceVos;
    }

    public List<UserEvaluateVo> getUserEvaluateVos() {
        return userEvaluateVos;
    }

    public void setUserEvaluateVos(List<UserEvaluateVo> userEvaluateVos) {
        this.userEvaluateVos = userEvaluateVos;
    }

    public List<UserPurposeVo> getUserPurposeVos() {
        return userPurposeVos;
    }

    public void setUserPurposeVos(List<UserPurposeVo> userPurposeVos) {
        this.userPurposeVos = userPurposeVos;
    }
}
