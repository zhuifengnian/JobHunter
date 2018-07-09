package com.stone.jobhunter.service.weixin;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.pojo.Resume;
import com.stone.jobhunter.service.BaseService;
import com.stone.jobhunter.vo.ListEnterpriseVo;
import com.stone.jobhunter.vo.ListResumeVo;

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
}