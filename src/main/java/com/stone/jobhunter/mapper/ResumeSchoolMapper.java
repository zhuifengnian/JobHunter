package com.stone.jobhunter.mapper;

import com.stone.jobhunter.pojo.ResumeSchool;
import com.stone.jobhunter.pojo.ResumeScience;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeSchoolMapper extends BaseMapper<ResumeSchool>{
    /**
     * 根据userId取数据库
     * @param userId
     * @return
     */
   List<ResumeSchool>getUserIdResumeSchool(Integer userId);
}