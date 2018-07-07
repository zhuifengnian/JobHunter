package com.stone.jobhunter.sys.mapper;


import com.stone.jobhunter.mapper.BaseMapper;
import com.stone.jobhunter.pojo.User;

public interface UserMapper extends BaseMapper<User> {
    Integer selectUserByOpenId(String open_id);

    User selectUserInfo(Integer uid);
}