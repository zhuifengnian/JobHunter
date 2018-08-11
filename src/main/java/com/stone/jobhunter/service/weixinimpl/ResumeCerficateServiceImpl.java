package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.ResumeCertificateMapper;
import com.stone.jobhunter.pojo.ResumeCertificate;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.ResumeCerficateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResumeCerficateServiceImpl extends AbstractBaseServiceImpl<ResumeCertificate> implements ResumeCerficateService {
   @Autowired
   private ResumeCertificateMapper resumeCertificateMapper;
    @Override
    public BaseMapper<ResumeCertificate> getDao() {
        return resumeCertificateMapper;
    }


    @Override
    public List<ResumeCertificate> getUserIdResumeCertificate(Integer resumeId) {
        return resumeCertificateMapper.getUserIdResumeCertificate(resumeId);
    }
}
