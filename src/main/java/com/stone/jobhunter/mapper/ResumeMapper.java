package com.stone.jobhunter.mapper;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.vo.ListResumeVo;
import com.stone.jobhunter.vo.SysResumeTableFormVO;
import com.stone.jobhunter.vo.SysResumeTableVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeMapper extends BaseMapper<Resume>{


    /**
     * 获取简历列表
     * @param page
     * @return
     */
    List<ListResumeVo> getListResume(@Param("userId") Integer userId, @Param("page")Page page);
    Integer getListResumeCount(Integer userId);

    /**
     * 根据userId取数据库
     * @param userId
     * @return
     */
    List<Resume>getUserIdResume(Integer userId);

    /**
     *
     * @param userId
     * @return
     */

    List<Resume> getUser(Integer userId);

    /**
     * 管理系统中列出筛选后的简历列表
     * @param resumeTableFormVO 各种筛选条件
     */
    List<SysResumeTableVO> listResumeTableVO(@Param("resumeTableFormVO") SysResumeTableFormVO resumeTableFormVO, @Param("page") Page page);

    Integer listResumeTableVOCount(@Param("resumeTableFormVO")SysResumeTableFormVO resumeTableFormVO);
}