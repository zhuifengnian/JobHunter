package com.stone.jobhunter.service.weixin;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.pojo.ResumeEnterprise;
import com.stone.jobhunter.pojo.ResumeEvaluate;
import com.stone.jobhunter.service.BaseService;
import com.stone.jobhunter.vo.ListEnterpriseVo;

import java.util.List;

/**
 * liyue 2018/7/8
 */
public interface ResumeEnterpriseService extends BaseService<ResumeEnterprise> {
    /**
     * 根据resumeId取数据库
     * @param resumeId
     * @return
     */
    List <ResumeEnterprise> getUserIdResumeEnterprise(Integer resumeId);
}