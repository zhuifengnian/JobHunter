package com.stone.jobhunter.service.weixinimpl;

import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.mapper.DeliverJobMapper;
import com.stone.jobhunter.pojo.DeliverJob;
import com.stone.jobhunter.service.AbstractBaseServiceImpl;
import com.stone.jobhunter.service.weixin.DeliverJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliverJobServiceImpl  extends AbstractBaseServiceImpl<DeliverJob> implements DeliverJobService {

   @Autowired
   private DeliverJobMapper deliverJobMapper;
    @Override
    public BaseMapper<DeliverJob> getDao() {
        return deliverJobMapper;
    }
}
