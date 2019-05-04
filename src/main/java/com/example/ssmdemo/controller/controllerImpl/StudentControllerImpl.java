package com.example.ssmdemo.controller.controllerImpl;

import com.example.ssmdemo.domain.Student;
import com.example.ssmdemo.service.IstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
//RestController是组合注解可以返回json格式，如果是对象就返回json；
@RestController
public class StudentControllerImpl {
    @Autowired
    private IstudentService service;
    //add
    @RequestMapping("/add")
    public String add(String name){
        service.add(name);
        return "add success";
    }
    //del
    @RequestMapping("/del")
    public String del(Long id ){
        service.del(id);
        return "del success";
    }
    //update
    @RequestMapping("/upd")
    public String upd(){
        Student stu = new Student();
        stu.setId("1234");
        stu.setName("测试姓名");
        service.upd(stu);
        return "upd success";
    }
    //select
    @RequestMapping("/sel")
    public Student get(Long id ){
        Student stu =service.get(id);
        return stu;
    }
    //select all
    @RequestMapping("/list")
    public List<Student> list(){
        List <Student> list = service.list();
        return list;
    }
}
