package com.stone.jobhunter.controller.sys;


import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;

import com.stone.jobhunter.pojo.Our;
import com.stone.jobhunter.service.sys.OurService;

import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.utils.QiNiuUtil;
import com.stone.jobhunter.vo.ListOurVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Calendar;

/**
 * liyue 2018/7/8
 */
@RestController
@RequestMapping("/sys/our")
public class SysOurController {
   @Autowired
   private OurService ourService;


    @ApiOperation(value = "插入我们", notes = "插入我们")
    @ResponseBody
    @RequestMapping(value = "/insertour", method = RequestMethod.POST)
    public ReturnMessage insertour(Our our , @RequestParam(value = "flyfile", required = false) MultipartFile flfile) {
        String picture=null;

        if(flfile!=null)
            picture=QiNiuUtil.manageFile(flfile);
        our.setPicture(picture);
        int insert=ourService.insert(our);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "删除我们", notes = "删除我们")
    @ResponseBody
    @RequestMapping(value = "/deleteour", method = RequestMethod.POST)
    public ReturnMessage deleteour(Integer id) {

        int insert=ourService.deleteByPrimaryKey(id);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "修改我们", notes = "修改我们")
    @ResponseBody
    @RequestMapping(value = "/modifyour", method = RequestMethod.POST)
    public ReturnMessage modifyour(Our our) {

         our.setUpdateTime(Calendar.getInstance().getTime());
        int insert=ourService.updateByPrimaryKeySelective(our);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "我们列表", notes = "我们列表")
    @ResponseBody
    @RequestMapping(value = "/listour", method = RequestMethod.POST)
    public ReturnMessage listour(@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer pageNumber) {
        PageInfo<ListOurVo> pageInfo=ourService.listOur(PageUtil.setPage(pageNumber));

        return new ReturnMessage(ResponseCode.OK, pageInfo);
    }
}