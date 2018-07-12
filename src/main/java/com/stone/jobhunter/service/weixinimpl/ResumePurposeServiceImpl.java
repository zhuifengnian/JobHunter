package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.ResumePurposeMapper;
import com.stone.jobhunter.pojo.ResumePurpose;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.ResumePurposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumePurposeServiceImpl  extends AbstractBaseServiceImpl<ResumePurpose> implements ResumePurposeService {

   @Autowired
   private ResumePurposeMapper resumePurposeMapper;
    @Override
    public BaseMapper<ResumePurpose> getDao() {
        return resumePurposeMapper;
    }
}
