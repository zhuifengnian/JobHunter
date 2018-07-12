package com.stone.jobhunter.controller.sys;

import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.service.weixin.EnterpriseService;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.utils.QiNiuUtil;
import com.stone.jobhunter.vo.ListEnterpriseVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Calendar;

/**
 * liyue 2018/7/8
 */
@RestController
@RequestMapping("/sys/enterprise")
public class SysEnterpriseController {
   @Autowired
   private EnterpriseService enterpriseService;


    @ApiOperation(value = "插入企业", notes = "插入企业")
    @ResponseBody
    @RequestMapping(value = "/insertEnterprise", method = RequestMethod.POST)
    public ReturnMessage insertEnterprise(Enterprise enterprise, @RequestParam(value = "flyfile", required = false) MultipartFile flfile) {
        String picture=null;
        if(flfile!=null)
            picture=QiNiuUtil.manageFile(flfile);
        enterprise.setAvatarurl(picture);
        int insert=enterpriseService.insert(enterprise);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "删除企业", notes = "删除企业")
    @ResponseBody
    @RequestMapping(value = "/deleteEnterprise", method = RequestMethod.POST)
    public ReturnMessage deleteEnterprise(Integer id) {
        Enterprise enterprise=new Enterprise();
        enterprise.setId(id);
        enterprise.setUpdateTime(Calendar.getInstance().getTime());
        enterprise.setState(0);
        int insert=enterpriseService.updateByPrimaryKeySelective(enterprise);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "修改企业", notes = "修改企业")
    @ResponseBody
    @RequestMapping(value = "/modifyEnterprise", method = RequestMethod.POST)
    public ReturnMessage modifyEnterprise(Enterprise enterprise) {

         enterprise.setUpdateTime(Calendar.getInstance().getTime());
        int insert=enterpriseService.updateByPrimaryKeySelective(enterprise);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "首页列表", notes = "首页列表")
    @ResponseBody
    @RequestMapping(value = "/listEnterprise", method = RequestMethod.POST)
    public ReturnMessage listEnterprise(String name,@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer pageNumber) {
        PageInfo<ListEnterpriseVo> pageInfo=enterpriseService.getList(name,PageUtil.setPage(pageNumber));

        return new ReturnMessage(ResponseCode.OK, pageInfo);
    }
}