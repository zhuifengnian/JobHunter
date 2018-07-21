package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.IndustryMapper;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.pojo.Industry;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.IndustryService;
import com.stone.jobhunter.vo.ListEnterpriseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndustryServiceImpl extends AbstractBaseServiceImpl<Industry> implements IndustryService {

    @Autowired
    private IndustryMapper industryMapper;
    @Override
    public BaseMapper<Industry> getDao() {
        return industryMapper;
    }

    @Override
    public List<Industry> getAllIndustry() {
        return industryMapper.getAllIndustry();
    }

    @Override
    public List<Enterprise> getIndustryEnterprise(Integer id) {
        return  industryMapper.getIndustryEnterprise(id);
    }

    @Override
    public PageInfo<ListEnterpriseVo> getAll(Page page) {
        PageInfo<ListEnterpriseVo> pageInfo =new PageInfo<>();
        pageInfo.setPageNum(page.getPageNumber());
        pageInfo.setPageSize(page.getPageSize());
       List<Industry> industryList= industryMapper.getAllIndustry();
       List<ListEnterpriseVo>listEnterpriseVoList=new ArrayList<>();
       for(int i=0;i<industryList.size();++i){
         List<Enterprise> enterpriseList=  industryMapper.getIndustryEnterprise(industryList.get(i).getId());
         for(int j=0;j<enterpriseList.size();++j){
             ListEnterpriseVo listEnterpriseVo=new ListEnterpriseVo();
             listEnterpriseVo.setIndustry(industryList.get(i).getIndustry());
             listEnterpriseVo.setAvatarurl(enterpriseList.get(j).getAvatarurl());
             listEnterpriseVo.setEnterpriseName(enterpriseList.get(j).getEnterpriseName());
             listEnterpriseVoList.add(listEnterpriseVo);

         }
       }
       pageInfo.setRows(listEnterpriseVoList);
       return pageInfo;
    }
}
