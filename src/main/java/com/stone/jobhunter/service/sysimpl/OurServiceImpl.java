package com.stone.jobhunter.service.sysimpl;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.OurMapper;
import com.stone.jobhunter.pojo.Our;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.sys.OurService;
import com.stone.jobhunter.vo.ListOurVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OurServiceImpl extends AbstractBaseServiceImpl<Our> implements OurService {

   @Autowired
   private OurMapper ourMapper;

    @Override
    public BaseMapper<Our> getDao() {
        return ourMapper;
    }

    @Override
    public PageInfo<ListOurVo> listOur(Page page) {
        PageInfo<ListOurVo> pageInfo=new PageInfo<>();
        pageInfo.setPageSize(page.getPageSize());
        pageInfo.setPageNum(page.getPageNumber());
        pageInfo.setRows(ourMapper.getListOur(page));
        pageInfo.setTotal(ourMapper.getListOurCount());
        return pageInfo;
    }
}
