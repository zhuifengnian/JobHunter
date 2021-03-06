package com.stone.jobhunter.service.weixin;


import com.stone.jobhunter.pojo.User;
import com.stone.jobhunter.service.BaseService;

/**
 * <br/>
 * fan 2018/6/13 10:56
 */
public interface UserService extends BaseService<User> {
    /**
     * 根据微信给的id来查找用户
     */
    Integer selectUserByOpenId(String open_id);

    /**
     * 返回用用户信息页的数据
     *
     * @param uid
     * @return
     */
    User selectUserInfo(Integer uid);
}