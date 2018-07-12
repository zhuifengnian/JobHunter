package com.stone.jobhunter.service.sys;


import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.Our;
import com.stone.jobhunter.service.BaseService;
import com.stone.jobhunter.vo.ListOurVo;


/**
 * liyue 2018/7/8
 */
public interface OurService extends BaseService<Our> {
    /**
     *
     * @param page
     * @return
     */
    PageInfo<ListOurVo> listOur(Page page);

}