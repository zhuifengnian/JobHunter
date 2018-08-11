package com.stone.jobhunter.controller.sys;



import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;

import com.stone.jobhunter.pojo.*;
import com.stone.jobhunter.service.sys.ResumeEnterpriseService;

import com.stone.jobhunter.service.weixin.ResumeCerficateService;
import com.stone.jobhunter.service.weixin.ResumeSchoolService;
import com.stone.jobhunter.service.weixin.ResumeScienceService;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.utils.pdfUtil;
import com.stone.jobhunter.vo.SysResumeTableFormVO;
import com.stone.jobhunter.vo.SysResumeTableVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * liyue 2018/7/8
 */
@RestController
@RequestMapping("/sys/resume")
public class SysResumeController {

    @Autowired
    private ResumeEnterpriseService resumeEnterpriseService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private ResumeScienceService resumeScienceService;
    @Autowired
    private ResumeSchoolService resumeSchoolService;
    @Autowired
    private ResumeCerficateService resumeCerficateService;

    @ApiOperation(value = "列出简历列表", notes = "根据各种条件，获得简历列表，比如企业名称，志愿序列，学校类型，" +
            "毕业时间，自我定位类型来检索")
    @RequestMapping(value = "/listResumeTableVO", method = RequestMethod.POST)
    public ReturnMessage listResumeTableVO(@RequestBody SysResumeTableFormVO resumeTableFormVO, @RequestParam(required = false, defaultValue = "6") Integer pageSize,
                                           @RequestParam Integer pageNumber)  {
        PageInfo<SysResumeTableVO> pageInfo = resumeService.listResumeTableVO(resumeTableFormVO, PageUtil.setPage(pageSize, pageNumber));
        return new ReturnMessage(ResponseCode.OK, pageInfo);
    }
    @ApiOperation(value = "导出pdf", notes = "导出pdf")
    @RequestMapping(value = "/getResumePDF", method = RequestMethod.POST)
    public ReturnMessage getResumePDf(String url,Integer userId)  {
        List<Resume> resumeList=resumeService.getUserIdResume(userId);
        List<ResumeScience> resumeScienceList=resumeScienceService.getUserIdResumeScience(resumeList.get(0).getId());
        List<ResumeSchool> resumeSchoolList=resumeSchoolService.getUserIdResumeSchool(resumeList.get(0).getId());
        List<ResumeEnterprise> resumeEnterpriseList=resumeEnterpriseService.getUserIdResumeEnterprise(resumeList.get(0).getId());
        List<ResumeCertificate> resumeCerficateList=resumeCerficateService.getUserIdResumeCertificate(resumeList.get(0).getId());
        pdfUtil.createPdf(url,resumeList,resumeScienceList,resumeSchoolList,resumeEnterpriseList,resumeCerficateList);

        return new ReturnMessage(ResponseCode.OK, 1);
    }
    @ApiOperation(value = "批量导出pdf", notes = "批量导出pdf")
    @RequestMapping(value = "/getListResumePDF", method = RequestMethod.POST)
    public ReturnMessage getListResumePDf(String url,Integer   []userId)  {
        for(int i=0;i<userId.length;++i) {
            List<Resume> resumeList = resumeService.getUserIdResume(userId[i]);
            List<ResumeScience> resumeScienceList = resumeScienceService.getUserIdResumeScience(resumeList.get(0).getId());
            List<ResumeSchool> resumeSchoolList = resumeSchoolService.getUserIdResumeSchool(resumeList.get(0).getId());
            List<ResumeEnterprise> resumeEnterpriseList = resumeEnterpriseService.getUserIdResumeEnterprise(resumeList.get(0).getId());
            List<ResumeCertificate> resumeCertificateList=resumeCerficateService.getUserIdResumeCertificate(resumeList.get(0).getId());
            pdfUtil.createPdf(url, resumeList, resumeScienceList, resumeSchoolList, resumeEnterpriseList,resumeCertificateList);
        }
        return new ReturnMessage(ResponseCode.OK, 1);
    }
}