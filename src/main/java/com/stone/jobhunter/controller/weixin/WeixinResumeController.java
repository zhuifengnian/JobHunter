package com.stone.jobhunter.controller.weixin;



import com.stone.jobhunter.pojo.*;
import com.stone.jobhunter.service.weixin.*;
import com.stone.jobhunter.utils.JsonUtil;
import com.stone.jobhunter.utils.QiNiuUtil;
import com.stone.jobhunter.utils.pdfUtil;
import com.stone.jobhunter.vo.*;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import com.stone.jobhunter.utils.PageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
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
      int []insert=resumeService.putResume(obj,JsonUtil.checkUserIdJson(obj));
        return new ReturnMessage(ResponseCode.OK,insert);
    }
    @RequestMapping(value = "/insertResumePicture", method = RequestMethod.POST)
    @ApiOperation(value = "存储图片信息")
    @ResponseBody
    public ReturnMessage insertResumePicture(@RequestParam("resumeId") Integer resumeId, @RequestParam(value = "flyfile", required = false) MultipartFile flfile) {
        int insert = resumeService.putPicture(resumeId,flfile);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "简历列表", notes = "简历列表")
    @RequestMapping(value = "/ListResume", method = RequestMethod.POST)
    public ReturnMessage ListResume(@RequestParam("userId")Integer userId,@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer pageNumber) {

        PageInfo<ListResumeVo> pageInfo=resumeService.getResumeList(userId,PageUtil.setPage(pageNumber));
        return new ReturnMessage(ResponseCode.OK, 0);
    }




}