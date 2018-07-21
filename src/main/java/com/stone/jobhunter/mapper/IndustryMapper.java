package com.stone.jobhunter.mapper;

import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.pojo.Industry;
import com.stone.jobhunter.vo.ListEnterpriseVo;

import java.util.List;
import java.util.Map;

public interface IndustryMapper extends BaseMapper<Industry>{
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
}