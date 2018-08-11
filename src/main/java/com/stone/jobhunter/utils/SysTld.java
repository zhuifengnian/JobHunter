package com.stone.jobhunter.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 管理系统中的一些自定义函数<br/>
 * fan 2018/7/22 23:42
 */
public class SysTld {

    public static Boolean isEmptyText(String text){
        if(text == null || "".equals(text)){
            return true;
        }
        return false;
    }

    public static String judgeSequence(String sequence){
        String ret = "其他志愿";
        switch (sequence){
            case "1":
                ret = "第一志愿";
                break;
            case "2":
                ret = "第二志愿";
                break;
            case "3":
                ret = "第三志愿";
                break;
        }
        return ret;
    }

    public static String judgeSchoolType(byte schoolType){
        String ret = "其他";
        switch (schoolType){
            case 0:
                ret = "专科";
                break;
            case 1:
                ret = "普通本科";
                break;
            case 2:
                ret = "985/211";
                break;
            case 3:
                ret = "其他";
                break;
        }
        return ret;
    }

    public static String judgeSelfPosition(String selfPosition){
        String ret = "其他定位";
        switch (selfPosition){
            case "0":
                ret = "学霸型";
                break;
            case "1":
                ret = "社交型";
                break;
            case "2":
                ret = "运动型";
            break;
        }
        return ret;
    }

    public static String translateDateType2YearAndMonth(Date date){
        String ret = "";
        ret = DateUtils.dateToString(date, DateUtils.YEAR_MONTH_PATTERN);
        return ret;
    }

    public static String translateDateType2YearAndMonth2(Date date){
        String ret = "";
        if(date != null){
            ret = DateUtils.dateToString(date, DateUtils.formatDate(date, "yyyy-MM"));
        }
        return ret;
    }

    public static String translateDateType2Year(Date date){
        String ret = "";
        ret = DateUtils.dateToString(date);
        return ret;
    }

    public static String judgeGender(int gender){
        String ret = "";
        switch (gender){
            case 1:
                ret = "男";
                break;
            case 2:
                ret = "女";
                break;
        }
        return ret;
    }
}