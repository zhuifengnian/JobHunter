package com.stone.jobhunter.mapper;

import com.stone.jobhunter.pojo.ResumePurpose;
import org.springframework.stereotype.Repository;


@Repository
public interface ResumePurposeMapper extends BaseMapper<ResumePurpose> {
    /**
     * 根据resumeId取数据库
     * @param resumeId
     * @return
     */
    ResumePurpose getUserIdResumePurpose(Integer resumeId);
}