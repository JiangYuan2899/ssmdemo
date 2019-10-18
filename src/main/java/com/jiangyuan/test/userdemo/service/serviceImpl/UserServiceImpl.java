package com.jiangyuan.test.userdemo.service.serviceImpl;

import com.jiangyuan.test.userdemo.dao.UserDAO;
import com.jiangyuan.test.userdemo.po.User;
import com.jiangyuan.test.userdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    /**
     *selectone
     */
    @Override
    public User queryUser(Integer userid){
        return userDAO.queryUser(userid);
    }
    /**
     *select list
     */
    @Override
    public List<User> queryUserlist(){
       return userDAO.queryUserlist();
   }
    /**
     * update
     */
//    public  User updUers(Integer userid,String username, String sex,String age){
//        return userDAO.updUser( userid, username,  sex, age);
//    }
    /**
     * save
     */
    @Override
    public  User saveUser(User user){
        return userDAO.saveUser( user);
    }
    /**
     * del
     */
    @Override
    public  Integer delUser(Integer userid){
        return userDAO.delUser(userid);
    }
}
