package com.stone.jobhunter.service.sysimpl;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.ResumeEvaluateMapper;
import com.stone.jobhunter.pojo.ResumeEvaluate;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.sys.ResumeEvaluateService;
import com.stone.jobhunter.vo.ListEvaluateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeEvaluateServiceImpl extends AbstractBaseServiceImpl<ResumeEvaluate> implements ResumeEvaluateService{
   @Autowired
   private ResumeEvaluateMapper resumeEvaluateMapper;

    @Override
    public BaseMapper<ResumeEvaluate> getDao() {
        return resumeEvaluateMapper;
    }

    @Override
    public PageInfo<ListEvaluateVo> getEvaluateList(Page page) {
        PageInfo<ListEvaluateVo> pageInfo=new PageInfo<>();
        pageInfo.setPageSize(page.getPageSize());
        pageInfo.setPageNum(page.getPageNumber());
        pageInfo.setRows(resumeEvaluateMapper.getListEvaluate(page));
        pageInfo.setTotal(resumeEvaluateMapper.getListEvaluateCount());
        return pageInfo;
    }

    @Override
    public Integer getEvaluateListCount() {
        return resumeEvaluateMapper.getListEvaluateCount();
    }
}
