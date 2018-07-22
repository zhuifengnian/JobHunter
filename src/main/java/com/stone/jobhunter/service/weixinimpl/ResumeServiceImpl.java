package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.*;
import com.stone.jobhunter.pojo.*;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.*;
import com.stone.jobhunter.utils.JsonUtil;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.utils.ReflectUtil;
import com.stone.jobhunter.vo.ListResumeVo;
import com.stone.jobhunter.vo.SysResumeTableVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Service
public class ResumeServiceImpl  extends AbstractBaseServiceImpl<Resume> implements ResumeService {

   @Autowired
   private ResumeMapper resumeMapper;
   @Autowired
   private ResumeService resumeService;
   @Autowired
   private ResumeEnterpriseService resumeEnterpriseService;
   @Autowired
   private ResumeScienceService resumeScienceService;
   @Autowired
   private ResumePurposeService resumePurposeService;
   @Autowired
   private ResumeSchoolService resumeSchoolService;
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
    public PageInfo<SysResumeTableVO> listResumeTableVO(SysResumeTableVO resumeTableVO, Page page) {

        PageInfo<SysResumeTableVO> pageInfo = new PageInfo<>();
        pageInfo.setPageNum(page.getPageNumber());
        pageInfo.setPageSize(page.getPageSize());
        pageInfo.setRows(resumeMapper.listResumeTableVO(resumeTableVO, page));
        pageInfo.setTotal(resumeMapper.listResumeTableVOCount(resumeTableVO));
        return pageInfo;
    }

    @Override
    public int[] putResume(String obj) throws ParseException, UnsupportedEncodingException  {
        int insert[]=new int[5];
        obj = new String(obj.getBytes("ISO-8859-1"), "UTF-8");
        obj=URLDecoder.decode(obj,"utf-8");
        Resume resume=JsonUtil.checkJson(obj);
        insert[0]=resumeService.insert(resume);
        List<ResumePurpose> resumePurposeList =JsonUtil.checkJson1(obj);
        for(ResumePurpose resumePurpose : resumePurposeList) {
            resumePurpose.setResumeId(insert[0]);
            insert[1] = resumePurposeService.insert(resumePurpose);
        }
        List<ResumeSchool>resumeSchoolList =JsonUtil.checkJson2(obj);
        for(ResumeSchool resumeSchool: resumeSchoolList) {
            resumeSchool.setResumeId(insert[0]);
            insert[2] = resumeSchoolService.insert(resumeSchool);
        }

        List<ResumeScience> resumeScienceList=JsonUtil.checkJson3(obj);
        for(ResumeScience resumeScience : resumeScienceList) {
            resumeScience.setResumeId(insert[0]);
            insert[3] = resumeScienceService.insert(resumeScience);
        }

        List<ResumeEnterprise> resumeEnterpriseList=JsonUtil.checkJson4(obj);
        for(ResumeEnterprise resumeEnterprise : resumeEnterpriseList) {
            resumeEnterprise.setResumeId(insert[0]);
            insert[4] = resumeEnterpriseService.insert(resumeEnterprise);
        }
        return insert;
    }
}
