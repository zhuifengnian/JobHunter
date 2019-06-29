package com.stone.jobhunter.controller.weixin;

import com.stone.jobhunter.pojo.User;
import com.stone.jobhunter.service.weixin.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试controller<br/>
 * fan 2018/6/13 10:34
 */
@Controller
@RequestMapping("/sys/test")
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String index() {
        return "/index.jsp";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        
        return "login";
    }
}