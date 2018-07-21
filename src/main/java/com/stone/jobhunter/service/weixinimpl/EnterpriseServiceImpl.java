package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.EnterpriseMapper;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.EnterpriseService;
import com.stone.jobhunter.vo.ListEnterpriseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl  extends AbstractBaseServiceImpl<Enterprise> implements EnterpriseService {
   @Autowired
   private EnterpriseMapper enterpriseMapper;
    @Override
    public BaseMapper<Enterprise> getDao() {
        return enterpriseMapper;
    }




    @Override
    public PageInfo<ListEnterpriseVo> getList(String name, Page page) {
        PageInfo<ListEnterpriseVo> pageInfo =new PageInfo<>();
        pageInfo.setPageNum(page.getPageNumber());
        pageInfo.setPageSize(page.getPageSize());
        if("大".equals(name)) {
            pageInfo.setRows(enterpriseMapper.getBigList(name,page));
            pageInfo.setTotal(enterpriseMapper.getBigListCount(name));
        }
        else if("中".equals(name)) {
            pageInfo.setRows(enterpriseMapper.getMediumList(name,page));
            pageInfo.setTotal(enterpriseMapper.getMediumListCount(name));
        }
        else if("小".equals(name)) {
            pageInfo.setRows(enterpriseMapper.getSmallList(name,page));
            pageInfo.setTotal(enterpriseMapper.getSmallListCount(name));
        }
        return pageInfo;
    }

    @Override
    public PageInfo<ListEnterpriseVo> getListEnterprise(Integer industryId, Page page) {
        PageInfo<ListEnterpriseVo> pageInfo =new PageInfo<>();
        pageInfo.setPageNum(page.getPageNumber());
        pageInfo.setPageSize(page.getPageSize());
       List<ListEnterpriseVo> listEnterpriseVoList= enterpriseMapper.getList(industryId,page);
       pageInfo.setRows(listEnterpriseVoList);
       return pageInfo;
    }
}
