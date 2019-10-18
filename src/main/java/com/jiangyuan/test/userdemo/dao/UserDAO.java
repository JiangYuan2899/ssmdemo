package com.jiangyuan.test.userdemo.dao;

import com.jiangyuan.test.userdemo.po.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserDAO {
    /**
     *selectone
     */
    @Select("select userid,username,sex,age from test.user where  userid = #{userid}")
    User queryUser(Integer userid);
    /**
     *select list
     */
    @Select("select userid,username,sex,age from test.user")
    List<User> queryUserlist();

    /**
     * update
     */
    @Update("update user set userid = #{userid},username=#{username},sex=#{sex},age=#{age}")
    User updUser(@Param("userid") Integer userid,@Param("username") String username,@Param("sex") String sex,@Param("age") String age);
    /**
     * save
     */
    @Insert("INSERT INTO user (userid, username, sex, age) value (#{userid},#{username},#{sex},#{age})")
    User saveUser(User user);
    /**
     * del
     */
    @Delete("DELETE FROM user WHERE userid =  #{userid}")
    Integer delUser(Integer userid);
}
