package com.stone.jobhunter.service.weixin;


import com.stone.jobhunter.pojo.ResumePurpose;
import com.stone.jobhunter.pojo.ResumeSchool;
import com.stone.jobhunter.service.BaseService;

/**
 * liyue 2018/7/8
 */
public interface ResumePurposeService extends BaseService<ResumePurpose> {
    /**
     * 根据resumeId取数据库
     * @param resumeId
     * @return
     */
    ResumePurpose getUserIdResumePurpose(Integer resumeId);
}