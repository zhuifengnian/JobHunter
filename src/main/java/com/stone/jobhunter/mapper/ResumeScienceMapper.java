package com.stone.jobhunter.mapper;

import com.stone.jobhunter.pojo.ResumePurpose;
import com.stone.jobhunter.pojo.ResumeScience;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeScienceMapper extends BaseMapper<ResumeScience>{


    /**
     * 根据resumeId取数据库
     * @param resumeId
     * @return
     */
    List<ResumeScience> getUserIdResumeScience(Integer resumeId);

}