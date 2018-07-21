package com.stone.jobhunter.controller.sys;



import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;

import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.service.sys.ResumeEnterpriseService;

import com.stone.jobhunter.service.weixin.ResumeService;
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

    @ApiOperation(value = "模糊查询", notes = "模糊查询")
    @RequestMapping(value = "/insertResume", method = RequestMethod.POST)
    public ReturnMessage getResume( @RequestParam("obj")  String obj)  {
        int insert=resumeEnterpriseService.getUserId(obj);
        List<Resume> resumeList=resumeService.getUserIdResume(insert);
        return new ReturnMessage(ResponseCode.OK, resumeList);
    }
}