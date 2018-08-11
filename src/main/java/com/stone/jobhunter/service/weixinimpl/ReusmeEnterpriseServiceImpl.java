package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.ResumeEnterpriseMapper;
import com.stone.jobhunter.pojo.ResumeEnterprise;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.ResumeEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReusmeEnterpriseServiceImpl  extends AbstractBaseServiceImpl<ResumeEnterprise> implements ResumeEnterpriseService{
   @Autowired
   private ResumeEnterpriseMapper resumeEnterpriseMapper;

    @Override
    public BaseMapper<ResumeEnterprise> getDao() {
        return resumeEnterpriseMapper;
    }


    @Override
    public List<ResumeEnterprise> getUserIdResumeEnterprise(Integer resumeId) {
        return resumeEnterpriseMapper.getUserIdResumeEnterprise(resumeId);
    }
}
