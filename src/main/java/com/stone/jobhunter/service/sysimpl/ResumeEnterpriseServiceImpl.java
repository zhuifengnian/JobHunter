package com.stone.jobhunter.service.sysimpl;

import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.ResumeEnterpriseMapper;
import com.stone.jobhunter.pojo.ResumeEnterprise;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.sys.ResumeEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeEnterpriseServiceImpl extends AbstractBaseServiceImpl<ResumeEnterprise> implements ResumeEnterpriseService {
  @Autowired
  private ResumeEnterpriseMapper resumeEnterpriseMapper;

    @Override
    public BaseMapper<ResumeEnterprise> getDao() {
        return resumeEnterpriseMapper;
    }

    @Override
    public Integer getUserId(String obj) {
        return resumeEnterpriseMapper.getUserId(obj);
    }

    @Override
    public List<ResumeEnterprise> getUserIdResumeEnterprise(Integer userId) {
        return resumeEnterpriseMapper.getUserIdResumeEnterprise(userId);
    }
}
