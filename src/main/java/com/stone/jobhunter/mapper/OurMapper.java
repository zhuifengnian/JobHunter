package com.stone.jobhunter.mapper;

import com.stone.jobhunter.pojo.Our;
import org.springframework.stereotype.Repository;

@Repository
public interface OurMapper extends BaseMapper<Our>{


    int updateByPrimaryKeyWithBLOBs(Our record);

}