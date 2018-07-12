package com.stone.jobhunter.controller.weixin;


import com.stone.jobhunter.pojo.*;
import com.stone.jobhunter.service.weixin.*;
import com.stone.jobhunter.service.weixinimpl.ReusmeEnterpriseServiceImpl;
import com.stone.jobhunter.utils.JsonUtil;
import net.sf.json.JSONArray;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.vo.ListResumeVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;


/**
 * liyue 2018/7/8
 */
@RestController
@RequestMapping("/weixin/resume")
public class WeixinResumeController {

@Autowired
private ResumeService resumeService;
@Autowired
private DeliverJobService deliverJobService;
@Autowired
private ResumePurposeService resumePurposeService;
@Autowired
private ResumeScienceService resumeScienceService;
@Autowired
private ResumeSchoolService resumeSchoolService;
@Autowired
private ResumeEnterpriseService resumeEnterpriseService;

    @ApiOperation(value = "添加简历", notes = "添加简历")
    @RequestMapping(value = "/insertResume", method = RequestMethod.POST)
    public ReturnMessage insertResume(@RequestBody  String obj) throws ParseException, UnsupportedEncodingException {
        int insert[]=new int[5];
        obj = new String(obj.getBytes("ISO-8859-1"), "UTF-8");
        Resume resume=JsonUtil.checkJson(obj);
        insert[0]=resumeService.insert(resume);
        List<ResumePurpose> resumePurposeList =JsonUtil.checkJson1(obj);
        for(ResumePurpose resumePurpose : resumePurposeList)
        insert[1]=resumePurposeService.insert(resumePurpose);

        List<ResumeSchool>resumeSchoolList =JsonUtil.checkJson2(obj);
        for(ResumeSchool resumeSchool: resumeSchoolList)
        insert[2]=resumeSchoolService.insert(resumeSchool);

        List<ResumeScience> resumeScienceList=JsonUtil.checkJson3(obj);
        for(ResumeScience resumeScience : resumeScienceList)
            insert[3]=resumeScienceService.insert(resumeScience);

       List<ResumeEnterprise> resumeEnterpriseList=JsonUtil.checkJson4(obj);
        for(ResumeEnterprise resumeEnterprise : resumeEnterpriseList)
            insert[3]=resumeEnterpriseService.insert(resumeEnterprise);
        return new ReturnMessage(ResponseCode.OK,insert);
    }
    @ApiOperation(value = "简历列表", notes = "简历列表")
    @RequestMapping(value = "/ListResume", method = RequestMethod.POST)
    public ReturnMessage ListResume(@RequestParam("userId")Integer userId,@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer pageNumber) {

        PageInfo<ListResumeVo> pageInfo=resumeService.getResumeList(userId,PageUtil.setPage(pageNumber));
        return new ReturnMessage(ResponseCode.OK, 0);
    }
    @ApiOperation(value = "简历投递", notes = "简历投递")
    @RequestMapping(value = "/PostResume", method = RequestMethod.POST)
    public ReturnMessage PostResume(@RequestParam("userId") Integer userId,@RequestParam("resumeId") Integer resumeId,@RequestParam("enterpriseId") Integer enterpriseId) {
        DeliverJob deliverJob=new DeliverJob();
        deliverJob.setResumeId(resumeId);
        deliverJob.setUserId(userId);
        deliverJob.setEnterpriseId(enterpriseId);
        int insert=deliverJobService.insert(deliverJob);
        return new ReturnMessage(ResponseCode.OK, insert);
    }
}