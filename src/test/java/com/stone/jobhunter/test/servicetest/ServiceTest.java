package com.stone.jobhunter.test.servicetest;

import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.ResumeEvaluateMapper;
import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.pojo.ResumePurpose;
import com.stone.jobhunter.pojo.ResumeScience;
import com.stone.jobhunter.pojo.User;
import com.stone.jobhunter.service.sys.ResumeEvaluateService;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.service.weixin.UserService;
import com.stone.jobhunter.utils.JsonUtil;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.vo.SysResumeTableVO;
import net.sf.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

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
   @Autowired
   private ResumeService resumeService;
    @Test
    public void testUserService() throws ParseException, UnsupportedEncodingException {
//        User user = new User();
//        user.setAvatarurl("http://avatar");
//        user.setEmail("fan@163.com");
//        user.setGender(1);
//        user.setNickname("测试用户");
//        user.setPhone("17523895985");
//        user.setOpenId("fweit2356284tweo");
//        int insert = userService.insert(user);
//        System.out.println(insert);
String obj="{\"resume\":{\"userId\":1,\"resumeName\":\"林俊旭的简历1号\",\"personInfo\":{\"name\":\"林俊旭\",\"birth\":\"1994-06-06\",\"age\":24,\"gender\":0,\"city\":\"武汉\",\"phone\":\"13282636372\",\"email\":\"769338334@qq.com\",\"IDcard\":\"3310xxxxxxxxx\",\"self_assessment\":\"我乐于助人，喜欢健身\",\"self_position\":1},\"purpose\":[{\"company\":\"阿里巴巴\",\"department\":\"阿里金服\",\"job\":[\"前端\",\"后端\",\"机器学习工程师\"]},{\"company\":\"阿里巴巴\",\"department\":\"阿里金服\",\"job\":[\"前端\",\"后端\",\"机器学习工程师\"]},{\"company\":\"阿里巴巴\",\"department\":\"阿里金服\",\"job\":[\"前端\",\"后端\",\"机器学习工程师\"]}],\"education\":[{\"school\":\"HUST\",\"major\":\"软件工程\",\"degree\":2,\"duration_start\":\"2017\",\"duration_end\":\"2020\",\"experience\":\"乐于助人，获奖xxxx\"},{\"school\":\"台州学院\",\"major\":\"物理师范\",\"degree\":1,\"duration_start\":\"2017\",\"duration_end\":\"2020\",\"experience\":\"见义勇为\"}],\"project\":[{\"name\":\"easykuaidi\",\"role\":\"前端\",\"detail\":\"我负责前端开发\",\"duration_start\":\"2017-5\",\"duration_end\":\"2017-7\"},{\"name\":\"easykuaidi\",\"role\":\"前端\",\"detail\":\"我负责前端开发\",\"duration_start\":\"2017-5\",\"duration_end\":\"2017-7\"}],\"work\":[{\"job\":\"技术主管\",\"company\":\"台州鸵鸵网络科技有限公司\",\"content\":\"协调公司项目开发，把控开发进度\",\"duration_start\":\"2017-5\",\"duration_end\":\"2017-7\"},{\"job\":\"技术主管\",\"company\":\"台州鸵鸵网络科技有限公司\",\"content\":\"协调公司项目开发，把控开发进度\",\"duration_start\":\"2017-5\",\"duration_end\":\"2017-7\"}]}}";
      //  System.out.println(obj);
   //   Resume resume= resumeService.getUserIdResume(1);
    //   System.out.println(resume.getAdress());
     System.out.println(resumeService.getUser(82));
    }

    @Test
    public void testListResume(){
      //  PageInfo<SysResumeTableVO> pageInfo = resumeService.listResumeTableVO(new SysResumeTableVO(), PageUtil.setPage(8,3));
        //System.out.println(pageInfo);

    }
}