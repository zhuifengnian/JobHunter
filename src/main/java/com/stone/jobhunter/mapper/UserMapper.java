package com.stone.jobhunter.mapper;


import com.stone.jobhunter.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    Integer selectUserByOpenId(String open_id);

    User selectUserInfo(Integer uid);
}