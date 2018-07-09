package com.stone.jobhunter.service.weixin;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.pojo.User;
import com.stone.jobhunter.service.BaseService;
import com.stone.jobhunter.vo.ListEnterpriseVo;

/**
 * liyue 2018/7/8
 */
public interface EnterpriseService extends BaseService<Enterprise> {
    /**
     * 获取企业列表
     * @param page
     * @return
     */
   PageInfo<ListEnterpriseVo> getList(String name,Page page);
}