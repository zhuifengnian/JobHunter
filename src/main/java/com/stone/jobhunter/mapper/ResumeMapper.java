package com.stone.jobhunter.mapper;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.vo.ListResumeVo;
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

}