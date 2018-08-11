package com.stone.jobhunter.test.servicetest;

import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.ResumeEvaluateMapper;
import com.stone.jobhunter.pojo.*;
import com.stone.jobhunter.service.sys.ResumeEnterpriseService;
import com.stone.jobhunter.service.sys.ResumeEvaluateService;
import com.stone.jobhunter.service.weixin.*;
import com.stone.jobhunter.utils.JsonUtil;
import com.stone.jobhunter.utils.PageUtil;
import com.stone.jobhunter.utils.pdfUtil;
import com.stone.jobhunter.vo.SysResumeTableFormVO;
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
    private ResumeEnterpriseService resumeEnterpriseService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private ResumeScienceService resumeScienceService;
    @Autowired
    private ResumeSchoolService resumeSchoolService;
    @Autowired
    private ResumeCerficateService resumeCerficateService;


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
        String obj="{\"resume\":{\"userId\":1,\"resumeName\":\"林俊旭的简历1号\",\"personInfo\":{\"name\":\"林俊旭\",\"birth\":\"1994-06-06\",\"age\":24,\"gender\":0,\"city\":\"武汉\",\"phone\":\"13282636372\",\"email\":\"769338334@qq.com\",\"IDcard\":\"3310xxxxxxxxx\",\"self_assessment\":\"我乐于助人，喜欢健身\",\"self_position\":1},\"purpose\":[{\"company\":\"阿里巴巴\",\"department\":\"阿里金服\",\"job\":[\"前端\",\"后端\",\"机器学习工程师\"]},{\"company\":\"阿里巴巴\",\"department\":\"阿里金服\",\"job\":[\"前端\",\"后端\",\"机器学习工程师\"]},{\"company\":\"阿里巴巴\",\"department\":\"阿里金服\",\"job\":[\"前端\",\"后端\",\"机器学习工程师\"]}],\"education\":[{\"school\":\"HUST\",\"major\":\"软件工程\",\"degree\":2,\"duration_start\":\"2017\",\"duration_end\":\"2020\",\"experience\":\"乐于助人，获奖xxxx\"},{\"school\":\"台州学院\",\"major\":\"物理师范\",\"degree\":1,\"duration_start\":\"2017\",\"duration_end\":\"2020\",\"experience\":\"见义勇为\"}],\"project\":[{\"name\":\"easykuaidi\",\"role\":\"前端\",\"detail\":\"我负责前端开发\",\"duration_start\":\"2017-5\",\"duration_end\":\"2017-7\"},{\"name\":\"easykuaidi\",\"role\":\"前端\",\"detail\":\"我负责前端开发\",\"duration_start\":\"2017-5\",\"duration_end\":\"2017-7\"}],\"work\":[{\"job\":\"技术主管\",\"company\":\"台州鸵鸵网络科技有限公司\",\"content\":\"协调公司项目开发，把控开发进度\",\"duration_start\":\"2017-5\",\"duration_end\":\"2017-7\"},{\"job\":\"技术主管\",\"company\":\"台州鸵鸵网络科技有限公司\",\"content\":\"协调公司项目开发，把控开发进度\",\"duration_start\":\"2017-5\",\"duration_end\":\"2017-7\"}],\"certificate\":[{\"name\":\"英语6级\",\"grade\":\"465\"}]}}";



List<ResumeCertificate> resumeCertificateList=JsonUtil.checkJson5(obj);
for(int i=0;i<resumeCertificateList.size();++i){
    System.out.println(resumeCertificateList.get(i).getName());
}
//        List<ResumeSchool> resumeSchoolList=JsonUtil.checkJson2(obj);
//        for(int i=0;i<resumeSchoolList.size();++i){
//            System.out.println(resumeSchoolList.get(i).getSchool());
//        }
   //  Resume resume= resumeService.getUserIdResume(1);
    //  System.out.println(resume.getAdress());

    // System.out.println(resumeService.getUser(82));
    }

    @Test
    public void testListResume(){
      //  PageInfo<SysResumeTableVO> pageInfo = resumeService.listResumeTableVO(new SysResumeTableFormVO(), PageUtil.setPage(8,3));
      //  System.out.println(pageInfo);
        List<Resume> resumeList=	resumeService.getUserIdResume(85);
        List<ResumeScience> resumeScienceList=resumeScienceService.getUserIdResumeScience(62);
        List<ResumeSchool> resumeSchoolList=resumeSchoolService.getUserIdResumeSchool(62);
        List<ResumeEnterprise> resumeEnterpriseList=resumeEnterpriseService.getUserIdResumeEnterprise(62);
        List<ResumeCertificate>resumeCertificateList =resumeCerficateService.getUserIdResumeCertificate(62);
        pdfUtil.createPdf("/Users/liyue/Downloads",resumeList,resumeScienceList,resumeSchoolList,resumeEnterpriseList,resumeCertificateList);

    }
}