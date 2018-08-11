package com.stone.jobhunter.service.weixin;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.pojo.ResumeCertificate;
import com.stone.jobhunter.service.BaseService;
import com.stone.jobhunter.vo.ListEnterpriseVo;

import java.util.List;

/**
 * liyue 2018/7/8
 */
public interface ResumeCerficateService extends BaseService<ResumeCertificate> {
    /**
     * 根据userId取数据库
     * @param userId
     * @return
     */
    List<ResumeCertificate> getUserIdResumeCertificate(Integer userId);
}