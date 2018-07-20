package com.stone.jobhunter.service.sys;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.ResumeEnterprise;
import com.stone.jobhunter.pojo.ResumeEvaluate;
import com.stone.jobhunter.service.BaseService;
import com.stone.jobhunter.vo.ListEvaluateVo;


/**
 * liyue 2018/7/8
 */
public interface ResumeEnterpriseService extends BaseService<ResumeEnterprise> {
    /**
     * 根据obj模糊查询
     * @param obj
     * @return
     */
    Integer getUserId(String obj);
}