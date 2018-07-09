package com.stone.jobhunter.test.servicetest;

import com.stone.jobhunter.mapper.ResumeEvaluateMapper;
import com.stone.jobhunter.pojo.User;
import com.stone.jobhunter.service.sys.ResumeEvaluateService;
import com.stone.jobhunter.service.weixin.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 专门用来做单元测试<br/>
 * fan 2018/4/26 23:17
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:springmvc-config.xml", "classpath:spring-shiro.xml"})
@WebAppConfiguration    //调用javaWEB的组件，比如自动注入ServletContext Bean等等
public class ServiceTest {
    @Autowired
    private UserService userService;
    @Autowired
    private ResumeEvaluateService resumeEvaluateService;
    @Autowired
    private ResumeEvaluateMapper resumeEvaluateMapper;

    @Test
    public void testUserService() {
//        User user = new User();
//        user.setAvatarurl("http://avatar");
//        user.setEmail("fan@163.com");
//        user.setGender(1);
//        user.setNickname("测试用户");
//        user.setPhone("17523895985");
//        user.setOpenId("fweit2356284tweo");
//        int insert = userService.insert(user);
//        System.out.println(insert);
       System.out.println( resumeEvaluateMapper.getListEvaluateCount());
    }
}