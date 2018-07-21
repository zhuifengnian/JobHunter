package com.stone.jobhunter.test.servicetest;

import com.stone.jobhunter.mapper.ResumeEvaluateMapper;
import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.pojo.ResumePurpose;
import com.stone.jobhunter.pojo.ResumeScience;
import com.stone.jobhunter.pojo.User;
import com.stone.jobhunter.service.sys.ResumeEvaluateService;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.service.weixin.UserService;
import com.stone.jobhunter.utils.JsonUtil;
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
        String obj="{ resume= {\n" +
                "\t\tuserId: 1,\n" +
                "\t\tresumeName: '林俊旭的简历1号',\n" +
                "\t\tpersonInfo: {\n" +
                "\t\t\tname: '林俊旭',\n" +
                "\t\t\tbirth: '1994-06-06',\n" +
                "\t\t\tage: 24,\n" +
                "\t\t\tgender: 0,\n" +
                "\t\t\tcity: '武汉',\n" +
                "\t\t\tphone: '13282636372',\n" +
                "\t\t\temail: '769338334@qq.com',\n" +
                "\t\t\tIDcard: '3310xxxxxxxxx',\n" +
                "\t\t\tself_assessment: '我乐于助人，喜欢健身'\n" +
                "\t\t},\n" +
                "\t\tpurpose: [{\n" +
                "\t\t\tcompany: '阿里巴巴',\n" +
                "\t\t\tdepartment: '阿里金服',\n" +
                "\t\t\tjob: '前端'\n" +
                "\t\t}, {\n" +
                "\t\t\tcompany: '阿里巴巴',\n" +
                "\t\t\tdepartment: '阿里金服',\n" +
                "\t\t\tjob: '前端'\n" +
                "\t\t}, {\n" +
                "\t\t\tcompany: '阿里巴巴',\n" +
                "\t\t\tdepartment: '阿里金服',\n" +
                "\t\t\tjob: '前端'\n" +
                "\t\t}],\n" +
                "\t\teducation: [{\n" +
                "\t\t\tschool: 'HUST',\n" +
                "\t\t\tmajor: '软件工程',\n" +
                "\t\t\tdegree: '硕士',\n" +
                "\t\t\tduration_start: '2017',\n" +
                "\t\t\tduration_end: '2020',\n" +
                "\t\t\texperience: '乐于助人，获奖xxxx'\n" +
                "\t\t}, {\n" +
                "\t\t\tschool: '台州学院',\n" +
                "\t\t\tmajor: '物理师范',\n" +
                "\t\t\tdegree: '本科',\n" +
                "\t\t\tduration_start: '2017',\n" +
                "\t\t\tduration_end: '2020',\n" +
                "\t\t\texperience: '见义勇为'\n" +
                "\t\t}],\n" +
                "\t\tproject: [{\n" +
                "\t\t\tname: 'easykuaidi',\n" +
                "\t\t\trole: '前端',\n" +
                "\t\t\tdetail: '我负责前端开发',\n" +
                "\t\t\tduration_start: '2017-5',\n" +
                "\t\t\tduration_end: '2017-7'\n" +
                "\t\t}, {\n" +
                "\t\t\tname: 'easykuaidi',\n" +
                "\t\t\trole: '前端',\n" +
                "\t\t\tdetail: '我负责前端开发',\n" +
                "\t\t\tduration_start: '2017-5',\n" +
                "\t\t\tduration_end: '2017-7'\n" +
                "\t\t}],\n" +
                "\t\twork: [{\n" +
                "\t\t\tjob: '技术主管',\n" +
                "\t\t\tcompany: '台州鸵鸵网络科技有限公司',\n" +
                "\t\t\tcontent: '协调公司项目开发，把控开发进度',\n" +
                "\t\t\tduration_start: '2017-5',\n" +
                "\t\t\tduration_end: '2017-7'\n" +
                "\t\t}, {\n" +
                "\t\t\tjob: '技术主管',\n" +
                "\t\t\tcompany: '台州鸵鸵网络科技有限公司',\n" +
                "\t\t\tcontent: '协调公司项目开发，把控开发进度',\n" +
                "\t\t\tduration_start: '2017-5',\n" +
                "\t\t\tduration_end: '2017-7'\n" +
                "\t\t}]\n" +
                "\t}\n"+
        "\t}";

      //  System.out.println(obj);
   //   Resume resume= resumeService.getUserIdResume(1);
    //   System.out.println(resume.getAdress());
     System.out.println(JsonUtil.checkJson(obj).getAdress());
    }
}