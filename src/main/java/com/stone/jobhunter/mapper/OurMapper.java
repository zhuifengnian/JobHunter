package com.stone.jobhunter.mapper;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.pojo.Our;
import com.stone.jobhunter.vo.ListOurVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OurMapper extends BaseMapper<Our>{
    /**
     * 获取我们列表
     * @param page
     * @return
     */
     List<ListOurVo> getListOur(Page page);
     Integer getListOurCount();

}