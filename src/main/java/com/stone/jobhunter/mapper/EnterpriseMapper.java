package com.stone.jobhunter.mapper;

import com.stone.jobhunter.basic.Page;
import com.stone.jobhunter.basic.PageInfo;
import com.stone.jobhunter.pojo.Enterprise;
import com.stone.jobhunter.vo.ListEnterpriseVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnterpriseMapper extends BaseMapper<Enterprise>{
    /**
     * 获取大企业列表
     * @param page
     * @return
     */
    List<ListEnterpriseVo> getBigList(@Param("name") String name, @Param("page")Page page);
    Integer getBigListCount(String name);
    /**
     * 获取中企业列表
     * @param page
     * @return
     */
    List<ListEnterpriseVo> getMediumList(@Param("name") String name, @Param("page")Page page);
    Integer getMediumListCount(String name);
    /**
     * 获取小企业列表
     * @param page
     * @return
     */
    List<ListEnterpriseVo> getSmallList(@Param("name") String name, @Param("page")Page page);
    Integer getSmallListCount(String name);

    /**
     * 获取企业列表
     * @param page
     * @return
     */
    List<ListEnterpriseVo> getList(@Param("IndustryId")  Integer IndustryId, @Param("page") Page page);
}