package com.stone.jobhunter.mapper;

import com.stone.jobhunter.pojo.ResumePurpose;
import org.springframework.stereotype.Repository;


@Repository
public interface ResumePurposeMapper extends BaseMapper<ResumePurpose> {
    /**
     * 根据userId取数据库
     * @param userId
     * @return
     */
    ResumePurpose getUserIdResumePurpose(Integer userId);
}