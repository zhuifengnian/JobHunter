package com.stone.jobhunter.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统管理员controller<br/>
 * fan 2018/7/19 15:59
 */
@Controller
@RequestMapping("/sys/admin")
public class SysAdminController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/resume")
    public String resume(){
        return "resumeAdmin";
    }
}