package com.stone.jobhunter.service.weixin;


import com.stone.jobhunter.pojo.ResumeSchool;
import com.stone.jobhunter.pojo.ResumeScience;
import com.stone.jobhunter.service.BaseService;

import java.util.List;

/**
 * liyue 2018/7/8
 */
public interface ResumeScienceService extends BaseService<ResumeScience> {
    /**
     * 根据userId取数据库
     * @param userId
     * @return
     */
    List<ResumeScience> getUserIdResumeScience(Integer userId);
}