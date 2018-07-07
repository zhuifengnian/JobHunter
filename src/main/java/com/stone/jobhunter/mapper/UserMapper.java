package com.stone.jobhunter.mapper;


import com.stone.jobhunter.pojo.User;

public interface UserMapper extends BaseMapper<User> {
    Integer selectUserByOpenId(String open_id);

    User selectUserInfo(Integer uid);
}