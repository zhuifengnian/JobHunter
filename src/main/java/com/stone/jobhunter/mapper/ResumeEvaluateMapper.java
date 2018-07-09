package com.stone.jobhunter.mapper;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.pojo.ResumeEvaluate;
import com.stone.jobhunter.vo.ListEvaluateVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeEvaluateMapper extends BaseMapper<ResumeEvaluate>{
    /**
     * 获取标签列表
     * @param page
     * @return
     */
     List<ListEvaluateVo> getListEvaluate(Page page);
     Integer getListEvaluateCount();
}