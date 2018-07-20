package com.stone.jobhunter.mapper;

import com.stone.jobhunter.pojo.ResumeEnterprise;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeEnterpriseMapper extends BaseMapper<ResumeEnterprise>{
    /**
     * 根据userId取数据库
     * @param userId
     * @return
     */
   List <ResumeEnterprise> getUserIdResumeEnterprise(Integer userId);

    /**
     * 根据obj模糊查询
     * @param obj
     * @return
     */
    Integer getUserId(String obj);
}