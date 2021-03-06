package com.stone.jobhunter.utils;

import com.stone.jobhunter.pojo.*;
import net.sf.json.JSONArray;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class JsonUtil {
    public static Integer checkUserIdJson(String json) throws ParseException {
        json = "[" + json + "]";
        JSONArray jsonArray = JSONArray.fromObject(json);
        Object result = jsonArray.getJSONObject(0).get("resume");
        Object person = "[" + result + "]";
        JSONArray jsonArrays = JSONArray.fromObject(person);
        Object id = jsonArrays.getJSONObject(0).get("userId");
        Integer userId = Integer.valueOf(String.valueOf(id));
        return userId;
    }

    public static Resume checkJson(String json) throws ParseException {
        json = "[" + json + "]";

        JSONArray jsonArray = JSONArray.fromObject(json);
        Object result = jsonArray.getJSONObject(0).get("resume");
        Object person = "[" + result + "]";
        JSONArray jsonArrays = JSONArray.fromObject(person);
        Object userId = jsonArrays.getJSONObject(0).get("userId");
        Object per = jsonArrays.getJSONObject(0).get("personInfo");
        Object personInfoMessage = "[" + per + "]";
        JSONArray jsonArrayss = JSONArray.fromObject(personInfoMessage);
        Resume resume = new Resume();
        String name = jsonArrayss.getJSONObject(0).get("name").toString();
        resume.setUserName(name);
        resume.setResumename(resume.getUserName());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        resume.setUserBirth(sdf.parse(String.valueOf(jsonArrayss.getJSONObject(0).get("birth"))));
        resume.setUserAge(Integer.valueOf(String.valueOf(jsonArrayss.getJSONObject(0).get("age"))));
        resume.setUserGender(String.valueOf(jsonArrayss.getJSONObject(0).get("gender")));
        resume.setAdress(String.valueOf(jsonArrayss.getJSONObject(0).get("city")));
        resume.setUserPhone(String.valueOf(jsonArrayss.getJSONObject(0).get("phone")));
        resume.setUserEmail(String.valueOf(jsonArrayss.getJSONObject(0).get("email")));
        resume.setWechat(String.valueOf(jsonArrayss.getJSONObject(0).get("wechat")));
        resume.setQq(String.valueOf(jsonArrayss.getJSONObject(0).get("qq")));
        resume.setSelfAssessment(String.valueOf(jsonArrayss.getJSONObject(0).get("self_assessment")));
        resume.setSelfPosition(String.valueOf(jsonArrayss.getJSONObject(0).get("self_position")));
        resume.setUpdateTime(Calendar.getInstance().getTime());
        resume.setState(1);
        resume.setUserId(Integer.valueOf(String.valueOf(userId)));
        return resume;
    }

    public static List<ResumePurpose> checkJson1(String json) throws ParseException {
        json = "[" + json + "]";
        List<ResumePurpose> resumePurposeList = new ArrayList<>();
        JSONArray jsonArray = JSONArray.fromObject(json);
        Object result = jsonArray.getJSONObject(0).get("resume");
        Object person = "[" + result + "]";
        JSONArray jsonArrays = JSONArray.fromObject(person);
        Object per = jsonArrays.getJSONObject(0).get("purpose");
        if (!per.equals("")) {
            Object userId = jsonArrays.getJSONObject(0).get("userId");
            JSONArray jsonArrayss = JSONArray.fromObject(per);
            for (int i = 0; i < jsonArrayss.size(); ++i) {
                ResumePurpose resumePurpose = new ResumePurpose();
                resumePurpose.setCompany(String.valueOf(jsonArrayss.getJSONObject(i).get("company")));
                resumePurpose.setDepartment(String.valueOf(jsonArrayss.getJSONObject(i).get("department")));
                resumePurpose.setPosition(String.valueOf(jsonArrayss.getJSONObject(i).get("job")).substring(1, String.valueOf(jsonArrayss.getJSONObject(i).get("job")).length() - 1));
                resumePurpose.setSequence(i + 1);
                resumePurpose.setUpdateTime(Calendar.getInstance().getTime());
                resumePurpose.setState(1);
                resumePurpose.setUserId(Integer.valueOf(String.valueOf(userId)));
                resumePurposeList.add(resumePurpose);
            }
        }


        return resumePurposeList;
    }

    public static List<ResumeSchool> checkJson2(String json) throws ParseException {
        json = "[" + json + "]";

        List<ResumeSchool> resumeSchoolArrayList = new ArrayList<>();
        JSONArray jsonArray = JSONArray.fromObject(json);
        Object result = jsonArray.getJSONObject(0).get("resume");
        Object school = "[" + result + "]";
        JSONArray jsonArrays = JSONArray.fromObject(school);
        Object per = jsonArrays.getJSONObject(0).get("education");
        if (!per.equals("")) {
            Object userId = jsonArrays.getJSONObject(0).get("userId");
            JSONArray jsonArrayss = JSONArray.fromObject(per);
            for (int i = 0; i < jsonArrayss.size(); ++i) {
                ResumeSchool resumeSchool = new ResumeSchool();
                resumeSchool.setDegree(String.valueOf(jsonArrayss.getJSONObject(i).get("degree")));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                resumeSchool.setStartTime(sdf.parse(String.valueOf(jsonArrayss.getJSONObject(i).get("duration_start"))));
                resumeSchool.setFinishTime(sdf.parse(String.valueOf(jsonArrayss.getJSONObject(i).get("duration_end"))));
                resumeSchool.setMajor(String.valueOf(jsonArrayss.getJSONObject(i).get("major")));
                resumeSchool.setSchool(String.valueOf(jsonArrayss.getJSONObject(i).get("school")));
                resumeSchool.setUpdateTime(Calendar.getInstance().getTime());
                resumeSchool.setExperience(String.valueOf(jsonArrayss.getJSONObject(i).get("experience")));
                resumeSchool.setState(1);
                resumeSchool.setSequence(i + 1);
                resumeSchool.setUserId(Integer.valueOf(String.valueOf(userId)));
                resumeSchoolArrayList.add(resumeSchool);
            }
        }


        return resumeSchoolArrayList;
    }

    public static List<ResumeScience> checkJson3(String json) throws ParseException {
        json = "[" + json + "]";

        List<ResumeScience> resumeScienceArrayList = new ArrayList<>();
        JSONArray jsonArray = JSONArray.fromObject(json);
        Object result = jsonArray.getJSONObject(0).get("resume");
        Object school = "[" + result + "]";
        JSONArray jsonArrays = JSONArray.fromObject(school);
        Object per = jsonArrays.getJSONObject(0).get("project");
        if (!per.equals("")) {
            Object userId = jsonArrays.getJSONObject(0).get("userId");
            JSONArray jsonArrayss = JSONArray.fromObject(per);
            for (int i = 0; i < jsonArrayss.size(); ++i) {
                ResumeScience resumeScience = new ResumeScience();
                resumeScience.setScienceName(String.valueOf(jsonArrayss.getJSONObject(i).get("name")));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
                resumeScience.setStartTime(sdf.parse(String.valueOf(jsonArrayss.getJSONObject(i).get("duration_start"))));
                resumeScience.setFinishTime(sdf.parse(String.valueOf(jsonArrayss.getJSONObject(i).get("duration_end"))));
                resumeScience.setScienceText(String.valueOf(jsonArrayss.getJSONObject(i).get("detail")));
                resumeScience.setContext(String.valueOf(jsonArrayss.getJSONObject(i).get("role")));
                resumeScience.setState(1);

                resumeScience.setUserId(Integer.valueOf(String.valueOf(userId)));
                resumeScienceArrayList.add(resumeScience);
            }
        }


        return resumeScienceArrayList;
    }

    public static List<ResumeEnterprise> checkJson4(String json) throws ParseException {
        json = "[" + json + "]";

        List<ResumeEnterprise> resumeEnterpriseArrayList = new ArrayList<>();
        JSONArray jsonArray = JSONArray.fromObject(json);
        Object result = jsonArray.getJSONObject(0).get("resume");
        Object school = "[" + result + "]";
        JSONArray jsonArrays = JSONArray.fromObject(school);
        Object per = jsonArrays.getJSONObject(0).get("work");
        if (!per.equals("")) {
            Object userId = jsonArrays.getJSONObject(0).get("userId");
            JSONArray jsonArrayss = JSONArray.fromObject(per);
            for (int i = 0; i < jsonArrayss.size(); ++i) {
                ResumeEnterprise resumeEnterprise = new ResumeEnterprise();
                resumeEnterprise.setEnterpriseName(String.valueOf(jsonArrayss.getJSONObject(i).get("company")));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
                resumeEnterprise.setStartTime(sdf.parse(String.valueOf(jsonArrayss.getJSONObject(i).get("duration_start"))));
                resumeEnterprise.setFinishTime(sdf.parse(String.valueOf(jsonArrayss.getJSONObject(i).get("duration_end"))));
                resumeEnterprise.setPosition(String.valueOf(jsonArrayss.getJSONObject(i).get("job")));
                resumeEnterprise.setContext(String.valueOf(jsonArrayss.getJSONObject(i).get("content")));
                resumeEnterprise.setState(1);
                resumeEnterprise.setUserId(Integer.valueOf(String.valueOf(userId)));
                resumeEnterpriseArrayList.add(resumeEnterprise);
            }
        }
        return resumeEnterpriseArrayList;
    }
    public static List<ResumeCertificate> checkJson5(String json) throws ParseException {
        json = "[" + json + "]";

        List<ResumeCertificate> resumeCertificateArrayList = new ArrayList<>();
        JSONArray jsonArray = JSONArray.fromObject(json);
        Object result = jsonArray.getJSONObject(0).get("resume");
        Object school = "[" + result + "]";
        JSONArray jsonArrays = JSONArray.fromObject(school);
        Object per = jsonArrays.getJSONObject(0).get("certificate");
        if (!per.equals("")) {
            Object userId = jsonArrays.getJSONObject(0).get("userId");
            JSONArray jsonArrayss = JSONArray.fromObject(per);
            for (int i = 0; i < jsonArrayss.size(); ++i) {
              ResumeCertificate resumeCertificate=new ResumeCertificate();
               resumeCertificate.setName(String.valueOf(jsonArrayss.getJSONObject(i).get("name")));
               resumeCertificate.setGrade(String.valueOf(jsonArrayss.getJSONObject(i).get("grade")));
               resumeCertificate.setState(1);
               resumeCertificate.setUserId(Integer.valueOf(String.valueOf(userId)));
                resumeCertificateArrayList.add(resumeCertificate);
            }
        }
        return resumeCertificateArrayList;
    }
}
