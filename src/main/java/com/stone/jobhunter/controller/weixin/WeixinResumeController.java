package com.stone.jobhunter.controller.weixin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import com.stone.jobhunter.pojo.DeliverJob;
import com.stone.jobhunter.service.weixin.DeliverJobService;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.vo.ListResumeVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.json.JsonObject;

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
    @ApiOperation(value = "添加简历", notes = "添加简历")
    @RequestMapping(value = "/insertResume", method = RequestMethod.POST)
    public ReturnMessage insertResume(@RequestBody JSONObject obj) {
        String data = obj.toJSONString();
        //解析json数据
        JSONObject json = JSON.parseObject(data);
        String createArr = json.getString("createArr");
        String modifyArr = json.getString("modifyArr");

        JSONArray createArray=JSONArray.parseArray(createArr);
        JSONObject.parseObject(JSONObject.toJSONString(createArray.get(0))).getLong("tempId");

        return new ReturnMessage(ResponseCode.OK, 0);
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