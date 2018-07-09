package com.stone.jobhunter.controller.sys;

import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.basic.ResponseCode;
import com.stone.jobhunter.basic.ReturnMessage;
import com.stone.jobhunter.pojo.ResumeEvaluate;
import com.stone.jobhunter.service.sys.ResumeEvaluateService;
import com.stone.jobhunter.service.weixin.EnterpriseService;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.vo.ListEnterpriseVo;
import com.stone.jobhunter.vo.ListEvaluateVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

/**
 * liyue 2018/7/8
 */
@RestController
@RequestMapping("/sys/evalute")
public class SysResumeEvaluateController {

@Autowired
 private ResumeEvaluateService resumeEvaluateService;

    @ApiOperation(value = "插入标签", notes = "插入标签")
    @ResponseBody
    @RequestMapping(value = "/insertEvaluate", method = RequestMethod.POST)
    public ReturnMessage insertEvaluate(String label) {
        ResumeEvaluate resumeEvaluate=new ResumeEvaluate();
        resumeEvaluate.setLabel(label);
        int insert=resumeEvaluateService.insert(resumeEvaluate);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "插入一组标签", notes = "插入一组标签")
    @ResponseBody
    @RequestMapping(value = "/insertListEvaluate", method = RequestMethod.POST)
    public ReturnMessage insertListEvaluate(String [] label) {

        int []insert=new int[label.length];
        int i=0;
        for(String s:label) {
            ResumeEvaluate resumeEvaluate=new ResumeEvaluate();
            resumeEvaluate.setLabel(s);
            insert[i] = resumeEvaluateService.insert(resumeEvaluate);
            i++;
        }
        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "删除标签", notes = "删除标签")
    @ResponseBody
    @RequestMapping(value = "/deleteEvaluate", method = RequestMethod.POST)
    public ReturnMessage deleteEvaluate(Integer id) {
        ResumeEvaluate resumeEvaluate=new ResumeEvaluate();
        resumeEvaluate.setId(id);
        resumeEvaluate.setState(0);
        resumeEvaluate.setUpdateTime(Calendar.getInstance().getTime());
        int insert=resumeEvaluateService.updateByPrimaryKeySelective(resumeEvaluate);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "修改标签", notes = "修改标签")
    @ResponseBody
    @RequestMapping(value = "/modifyEvaluate", method = RequestMethod.POST)
    public ReturnMessage modifyEvaluate(ResumeEvaluate resumeEvaluate) {
        resumeEvaluate.setUpdateTime(Calendar.getInstance().getTime());
        int insert=resumeEvaluateService.updateByPrimaryKeySelective(resumeEvaluate);

        return new ReturnMessage(ResponseCode.OK, insert);
    }
    @ApiOperation(value = "标签列表", notes = "标签列表")
    @ResponseBody
    @RequestMapping(value = "/ListEvaluate", method = RequestMethod.POST)
    public ReturnMessage ListEvaluate(@RequestParam(required = false) Integer pageSize, @RequestParam(required = false) Integer pageNumber) {

        PageInfo<ListEvaluateVo>pageInfo=resumeEvaluateService.getEvaluateList(PageUtil.setPage(pageNumber));

        return new ReturnMessage(ResponseCode.OK, pageInfo);
    }
}