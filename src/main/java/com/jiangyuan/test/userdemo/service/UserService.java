package com.jiangyuan.test.userdemo.service;

import com.jiangyuan.test.userdemo.po.User;

import java.util.List;

public interface UserService {
    /**
     *selectone
     */
    User queryUser(Integer userid);
    /**
     *select list
     */
    List<User> queryUserlist();
    /**
     * update
     */
//    User upduser(Integer userid,String username, String sex,String age);
    /**
     * save
     */
    User saveUser(User user);
    /**
     * del
     */
    Integer delUser(Integer userid);
}
