package com.stone.jobhunter.service.weixin;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.pojo.Industry;
import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.service.BaseService;
import com.stone.jobhunter.vo.ListEnterpriseVo;
import com.stone.jobhunter.vo.ListResumeVo;

import java.util.List;

/**
 * liyue 2018/7/8
 */
public interface IndustryService extends BaseService<Industry> {
    /**
     * 获取所有行业
     * @return
     */
    List<Industry> getAllIndustry();
    /**
     * 根据行业取找企业
     * @param id
     * @return
     */
    List<Enterprise> getIndustryEnterprise(Integer id);

    /**
     * 找到所有行业
     * @return
     */
    PageInfo<ListEnterpriseVo> getAll(Page page);

}