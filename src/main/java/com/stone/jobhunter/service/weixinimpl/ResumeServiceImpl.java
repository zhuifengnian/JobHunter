package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.*;
import com.stone.jobhunter.pojo.*;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.utils.JsonUtil;
import com.stone.jobhunter.vo.ListResumeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.util.List;

@Service
public class ResumeServiceImpl  extends AbstractBaseServiceImpl<Resume> implements ResumeService {

   @Autowired
   private ResumeMapper resumeMapper;
   @Autowired
   private ResumeEnterpriseMapper resumeEnterpriseMapper;
   @Autowired
   private ResumeScienceMapper resumeScienceMapper;
   @Autowired
   private ResumePurposeMapper resumePurposeMapper;
   @Autowired
   private ResumeSchoolMapper resumeSchoolMapper;
    @Override
    public BaseMapper<Resume> getDao() {
        return resumeMapper;
    }


    @Override
    public PageInfo<ListResumeVo> getResumeList(Integer userId, Page page) {
        PageInfo<ListResumeVo>pageInfo=new PageInfo<>();
        pageInfo.setPageNum(page.getPageNumber());
        pageInfo.setPageSize(page.getPageSize());
        pageInfo.setRows(resumeMapper.getListResume(userId,page));
        pageInfo.setTotal(resumeMapper.getListResumeCount(userId));
        return pageInfo;
    }

    @Override
    public List<Resume> getUserIdResume(Integer userId) {
        return resumeMapper.getUserIdResume(userId);
    }

    @Override
    public int[] putResume(String obj) throws ParseException, UnsupportedEncodingException  {
        int insert[]=new int[5];
        obj = new String(obj.getBytes("ISO-8859-1"), "UTF-8");
        obj=URLDecoder.decode(obj,"utf-8");
        Resume resume=JsonUtil.checkJson(obj);
        insert[0]=resumeMapper.insert(resume);
        List<ResumePurpose> resumePurposeList =JsonUtil.checkJson1(obj);
        for(ResumePurpose resumePurpose : resumePurposeList) {
            resumePurpose.setResumeId(insert[1]);
            insert[1] = resumePurposeMapper.insert(resumePurpose);
        }
        List<ResumeSchool>resumeSchoolList =JsonUtil.checkJson2(obj);
        for(ResumeSchool resumeSchool: resumeSchoolList) {
            resumeSchool.setResumeId(insert[0]);
            insert[2] = resumeSchoolMapper.insert(resumeSchool);
        }

        List<ResumeScience> resumeScienceList=JsonUtil.checkJson3(obj);
        for(ResumeScience resumeScience : resumeScienceList) {
            resumeScience.setResumeId(insert[0]);
            insert[3] = resumeScienceMapper.insert(resumeScience);
        }

        List<ResumeEnterprise> resumeEnterpriseList=JsonUtil.checkJson4(obj);
        for(ResumeEnterprise resumeEnterprise : resumeEnterpriseList) {
            resumeEnterprise.setResumeId(insert[0]);
            insert[4] = resumeEnterpriseMapper.insert(resumeEnterprise);
        }
        return insert;
    }
}
