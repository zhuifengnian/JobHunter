package com.stone.jobhunter.vo;

import lombok.Data;

import java.util.Date;

/**
 * 管理系统中简历列表数据类<br/>
 * fan 2018/7/21 19:25
 */
@Data
public class SysResumeTableVO {
    private String resumeName;
    private String company; //目标公司
    private String userName;
    private String userPhoto;
    private int userGender;
    private String userPhone;
    private int sequence;   //1,第一志愿    2，第二志愿  3，第三志愿
    private byte schoolType;  //学校类型
    private Date finishTime;    //毕业时间
    private String selfPosition;    //自我定位（前端通过下拉选择）
    private Date createTime;
}