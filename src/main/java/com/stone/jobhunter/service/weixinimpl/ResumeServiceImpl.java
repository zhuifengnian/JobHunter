package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.ResumeMapper;
import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.ResumeService;
import com.stone.jobhunter.vo.ListResumeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl  extends AbstractBaseServiceImpl<Resume> implements ResumeService {

   @Autowired
   private ResumeMapper resumeMapper;
    @Override
    public BaseMapper<Resume> getDao() {
        return resumeMapper;
    }


    @Override
    public PageInfo<ListResumeVo> getResumeList(Integer userId, Page page) {
        PageInfo<ListResumeVo>pageInfo=new PageInfo<>();
        pageInfo.setPageNum(page.getPageNumber());
        pageInfo.setPageSize(page.getPageSize());
        pageInfo.setRows(resumeMapper.getListResume(userId,page));
        pageInfo.setTotal(resumeMapper.getListResumeCount(userId));
        return pageInfo;
    }

    @Override
    public List<Resume> getUserIdResume(Integer userId) {
        return resumeMapper.getUserIdResume(userId);
    }
}
