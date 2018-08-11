package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.ResumeSchoolMapper;
import com.stone.jobhunter.pojo.ResumeSchool;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.ResumeSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeSchoolServiceImpl  extends AbstractBaseServiceImpl<ResumeSchool> implements ResumeSchoolService {

   @Autowired
   private ResumeSchoolMapper resumeSchoolMapper;
    @Override
    public BaseMapper<ResumeSchool> getDao() {
        return resumeSchoolMapper;
    }


    @Override
    public List<ResumeSchool> getUserIdResumeSchool(Integer resumeId) {
        return resumeSchoolMapper.getUserIdResumeSchool(resumeId);
    }
}
