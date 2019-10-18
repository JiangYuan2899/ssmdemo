package com.jiangyuan.test.userdemo.controller;


import com.jiangyuan.test.userdemo.po.User;
import com.jiangyuan.test.userdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Autowired
     private UserService userService;

    /**
     *selectone
     * 如果去数据库查没有查到如果返回给前端
     */
    @GetMapping("/selectone/{userid}")
    public ResponseEntity<Object> queryUser(@PathVariable Integer userid){
     System.out.println(userid+"queryUser");
    return new ResponseEntity(userService.queryUser(userid),HttpStatus.OK);
   }
    /**
     *select list
     */
    @GetMapping("/getlist")
    public ResponseEntity<Object> queryUser(){
        return new ResponseEntity(userService.queryUserlist(), HttpStatus.OK);
    }

    /**
     * save
     */
    @PostMapping
    public ResponseEntity<Object> saveUser(@RequestBody User user){
        return new ResponseEntity(userService.saveUser(user), HttpStatus.OK);
    }
    /**
     * update
     */
//    @PostMapping
//    public ResponseEntity<Object> updUser(@RequestBody User user){
//        return new ResponseEntity(userService.updUser(user), HttpStatus.OK);
//    }
    /**
     * del
     */
    @PostMapping("/del/{userid}")
    public ResponseEntity<Object> delUser(@PathVariable Integer userid){
        System.out.println(userid+"delUser");
        return new ResponseEntity(userService.delUser(userid), HttpStatus.OK);
    }
}
