package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.*;
import com.stone.jobhunter.pojo.*;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.*;
import com.stone.jobhunter.utils.JsonUtil;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.utils.QiNiuUtil;
import com.stone.jobhunter.utils.ReflectUtil;
import com.stone.jobhunter.vo.ListResumeVo;
import com.stone.jobhunter.vo.SysResumeTableFormVO;
import com.stone.jobhunter.vo.SysResumeTableVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

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
   @Autowired
   private ResumeCerficateService resumeCerficateService;
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
    public List<Resume> getUser(Integer userId) {
        return resumeMapper.getUser(userId);
    }

    @Override
    public PageInfo<SysResumeTableVO> listResumeTableVO(SysResumeTableFormVO resumeTableFormVO, Page page) {

        PageInfo<SysResumeTableVO> pageInfo = new PageInfo<>();
        pageInfo.setPageNum(page.getPageNumber());
        pageInfo.setPageSize(page.getPageSize());
        pageInfo.setRows(resumeMapper.listResumeTableVO(resumeTableFormVO, page));
        pageInfo.setTotal(resumeMapper.listResumeTableVOCount(resumeTableFormVO));
        return pageInfo;
    }

    @Override
    public int[] putResume(String obj,Integer userId) throws ParseException {
        List<Resume> resumeList=resumeMapper.getUser(userId);
        if(resumeList.size()!=0){
            for(Resume resume:resumeList){
                resume.setUpdateTime(Calendar.getInstance().getTime());
                resume.setState(0);
                resumeMapper.updateByPrimaryKeySelective(resume);
            }
        }
        int insert[]=new int[6];
        Resume resume=JsonUtil.checkJson(obj);
        if(resume.getSelfPosition().equals("0")){
           resume.setSelfPosition("学术型");
        }
        else if(resume.getSelfPosition().equals("1")){
            resume.setSelfPosition("技术型");
        }
        else if(resume.getSelfPosition().equals("1")){
            resume.setSelfPosition("实践型");
        }
        else{
            resume.setSelfPosition("社交型");
        }
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
        List<ResumeCertificate> resumeCertificateList=JsonUtil.checkJson5(obj);
        for(ResumeCertificate resumeCertificate:resumeCertificateList){
            resumeCertificate.setResumeId(insert[0]);
            insert[5]=resumeCerficateService.insert(resumeCertificate);
        }
        return insert;
    }

    @Override
    public int putPicture(Integer resumeId, MultipartFile flfile) {
        Resume resume=new Resume();
        resume.setId(resumeId);
        String picture ;
        int insert=0;
        if (flfile != null) {
            picture = QiNiuUtil.manageFile(flfile);
            resume.setUpdateTime(Calendar.getInstance().getTime());
            resume.setUserPhoto(picture);
           insert= resumeService.updateByPrimaryKeySelective(resume);
        }
        return insert;
    }
}
