package com.stone.jobhunter.vo;

import lombok.Data;

import java.util.Date;

/**
 * 用于检索简历的类<br/>
 * fan 2018/7/23 13:17
 */
@Data
public class SysResumeTableFormVO {
    private String resumeName;
    private String company; //目标公司
    private Integer sequence;   //1,第一志愿    2，第二志愿  3，第三志愿
    private Byte schoolType;  //学校类型
    private Date finishStartTime;    //毕业开始时间
    private Date finishEndTime;    //毕业开始时间
    private Integer selfPosition;    //自我定位（前端通过下拉选择）
}