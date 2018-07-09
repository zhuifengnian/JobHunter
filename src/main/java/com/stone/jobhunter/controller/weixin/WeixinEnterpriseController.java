package com.stone.jobhunter.controller.weixin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import com.stone.jobhunter.service.weixin.EnterpriseService;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.vo.ListEnterpriseVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * liyue 2018/7/8
 */
@RestController
@RequestMapping("/weixin/enterprise")
public class WeixinEnterpriseController {
   @Autowired
   private EnterpriseService enterpriseService;


    @ApiOperation(value = "首页列表", notes = "首页列表")
    @ResponseBody
    @RequestMapping(value = "/listEnterprise", method = RequestMethod.POST)
    public ReturnMessage listEnterprise(String name,@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer pageNumber) {
        PageInfo<ListEnterpriseVo> pageInfo=enterpriseService.getList(name,PageUtil.setPage(pageNumber));

        return new ReturnMessage(ResponseCode.OK, pageInfo);
    }
}