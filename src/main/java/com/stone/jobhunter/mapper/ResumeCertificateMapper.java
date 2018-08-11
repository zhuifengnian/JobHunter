package com.stone.jobhunter.mapper;

import com.stone.jobhunter.pojo.ResumeCertificate;
import com.stone.jobhunter.pojo.ResumeEnterprise;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeCertificateMapper extends BaseMapper<ResumeCertificate> {
    /**
     * 根据resumeId取数据库
     * @param resumeId
     * @return
     */
    List<ResumeCertificate> getUserIdResumeCertificate(Integer resumeId);
}