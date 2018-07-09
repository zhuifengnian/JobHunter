package com.stone.jobhunter.service.sys;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.ResumeEvaluate;
import com.stone.jobhunter.service.BaseService;
import com.stone.jobhunter.vo.ListEvaluateVo;


/**
 * liyue 2018/7/8
 */
public interface ResumeEvaluateService extends BaseService<ResumeEvaluate> {
    /**
     *
     * @param page
     * @return
     */
     PageInfo<ListEvaluateVo> getEvaluateList(Page page);
     Integer getEvaluateListCount();
}