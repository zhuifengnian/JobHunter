package com.stone.jobhunter.controller.weixin;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import com.stone.jobhunter.pojo.Industry;
import com.stone.jobhunter.service.weixin.EnterpriseService;
import com.stone.jobhunter.service.weixin.IndustryService;
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
    @Autowired
    private IndustryService industryService;

    @ApiOperation(value = "企业列表", notes = "企业列表")
    @ResponseBody
    @RequestMapping(value = "/listEnterprise", method = RequestMethod.POST)
    public ReturnMessage listEnterprise(@RequestParam("industryId") Integer industryId,@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer pageNumber) {
        PageInfo<ListEnterpriseVo> pageInfo=enterpriseService.getListEnterprise(industryId,PageUtil.setPage(pageSize,pageNumber));

        return new ReturnMessage(ResponseCode.OK, pageInfo);
    }
    @ApiOperation(value = "首页列表", notes = "首页列表")
    @ResponseBody
    @RequestMapping(value = "/listIndustry", method = RequestMethod.POST)
    public ReturnMessage listIndustry(String name,@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer pageNumber) {
        PageInfo<ListEnterpriseVo> listEnterpriseVoPageInfo=industryService.getAll(PageUtil.setPage(pageSize,pageNumber));

        return new ReturnMessage(ResponseCode.OK, listEnterpriseVoPageInfo);
    }
}