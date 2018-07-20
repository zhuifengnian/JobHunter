package com.stone.jobhunter.controller.sys;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import com.stone.jobhunter.pojo.*;
import com.stone.jobhunter.service.weixin.*;
import com.stone.jobhunter.utils.JsonUtil;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.utils.QiNiuUtil;
import com.stone.jobhunter.vo.ListResumeVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;


/**
 * liyue 2018/7/8
 */
@RestController
@RequestMapping("/sys/resume")
public class SysResumeController {

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

    @ApiOperation(value = "模糊查询", notes = "模糊查询")
    @RequestMapping(value = "/insertResume", method = RequestMethod.POST)
    public ReturnMessage getResume( @RequestParam("obj")  String obj,@RequestParam("name") String name )  {
        int insert=0;
        return new ReturnMessage(ResponseCode.OK, insert);
    }
}