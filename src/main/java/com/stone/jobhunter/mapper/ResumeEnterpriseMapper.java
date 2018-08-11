package com.stone.jobhunter.mapper;

import com.stone.jobhunter.pojo.ResumeEnterprise;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeEnterpriseMapper extends BaseMapper<ResumeEnterprise>{
    /**
     * 根据resumeId取数据库
     * @param resumeId
     * @return
     */
   List <ResumeEnterprise> getUserIdResumeEnterprise(Integer resumeId);

    /**
     * 根据obj模糊查询
     * @param obj
     * @return
     */
    Integer getUserId(String obj);
}