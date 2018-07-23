package com.stone.jobhunter.service.weixin;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.service.BaseService;
import com.stone.jobhunter.vo.ListEnterpriseVo;
import com.stone.jobhunter.vo.ListResumeVo;
import com.stone.jobhunter.vo.SysResumeTableFormVO;
import com.stone.jobhunter.vo.SysResumeTableVO;
import org.springframework.web.multipart.MultipartFile;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;

/**
 * liyue 2018/7/8
 */
public interface ResumeService extends BaseService<Resume> {
    /**
     *
     * @param page
     * @return
     */
   PageInfo<ListResumeVo> getResumeList(Integer userId,Page page);
    /**
     * 根据userId取数据库
     * @param userId
     * @return
     */
   List<Resume> getUserIdResume(Integer userId);
    /**
     *
     * @param userId
     * @return
     */

    List<Resume> getUser(Integer userId);

    /**
     * 存储简历
     * @return
     */
   int [] putResume(String obj,Integer userId) throws ParseException, UnsupportedEncodingException;

    /**
     * 存储图片
     * @param resumeId
     * @param flfile
     * @return
     */
   int putPicture(Integer resumeId,  MultipartFile flfile) ;


   /////////////////////////管理系统/////////////////////////////////

    /**
     * 根据各种查询条件列出符合要求的简历
     * @param resumeTableFormVO
     * @param page
     */
    PageInfo<SysResumeTableVO> listResumeTableVO(SysResumeTableFormVO resumeTableFormVO, Page page);
}