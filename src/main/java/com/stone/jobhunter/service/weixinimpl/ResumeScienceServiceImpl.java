package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.ResumeScienceMapper;
import com.stone.jobhunter.pojo.ResumeScience;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.ResumeScienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeScienceServiceImpl  extends AbstractBaseServiceImpl<ResumeScience> implements ResumeScienceService {
   @Autowired
   private ResumeScienceMapper resumeScienceMapper;

    @Override
    public BaseMapper<ResumeScience> getDao() {
        return resumeScienceMapper;
    }

    @Override
    public List<ResumeScience> getUserIdResumeScience(Integer userId) {
        return resumeScienceMapper.getUserIdResumeScience(userId);
    }
}
