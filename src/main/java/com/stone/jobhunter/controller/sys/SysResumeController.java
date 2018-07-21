package com.stone.jobhunter.controller.sys;



import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;

import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.pojo.ResumeEnterprise;
import com.stone.jobhunter.pojo.ResumeSchool;
import com.stone.jobhunter.pojo.ResumeScience;
import com.stone.jobhunter.service.sys.ResumeEnterpriseService;

import com.stone.jobhunter.service.weixin.ResumeSchoolService;
import com.stone.jobhunter.service.weixin.ResumeScienceService;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.utils.pdfUtil;
import com.stone.jobhunter.vo.ResumeVo;
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

    @ApiOperation(value = "导出pdf", notes = "导出pdf")
    @RequestMapping(value = "/getResumePDF", method = RequestMethod.POST)
    public ReturnMessage getResumePDf(@RequestParam("url") String url,@RequestParam("userId") Integer userId)  {
        List<Resume> resumeList=	resumeService.getUserIdResume(userId);
        List<ResumeScience> resumeScienceList=resumeScienceService.getUserIdResumeScience(userId);
        List<ResumeSchool> resumeSchoolList=resumeSchoolService.getUserIdResumeSchool(userId);
        List<ResumeEnterprise> resumeEnterpriseList=resumeEnterpriseService.getUserIdResumeEnterprise(userId);
        pdfUtil.createPdf(url,resumeList,resumeScienceList,resumeSchoolList,resumeEnterpriseList);

        return new ReturnMessage(ResponseCode.OK, 1);
    }

}