package com.stone.jobhunter.controller.sys;

import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.vo.SysResumeTableFormVO;
import com.stone.jobhunter.vo.SysResumeTableVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 系统管理员controller<br/>
 * fan 2018/7/19 15:59
 */
@Controller
@RequestMapping("/sys")
public class SysAdminController {
    @Autowired
    private ResumeService resumeService;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/resume", method = RequestMethod.GET)
    public String resume(Model model){

        SysResumeTableFormVO resumeTableFormVO = new SysResumeTableFormVO();
//        resumeTableFormVO.setSequence(2);
        PageInfo<SysResumeTableVO> pageInfo = resumeService.listResumeTableVO(resumeTableFormVO, PageUtil.setPage(6, 1));
        model.addAttribute("resumePageInfo", pageInfo);
        return "resumeList";
    }

    @RequestMapping(value = "/resumeEditor", method = RequestMethod.GET)
    public String resumeEditor(){
        return "resumeEditor";
    }
}