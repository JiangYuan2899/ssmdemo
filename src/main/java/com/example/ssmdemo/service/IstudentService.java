package com.example.ssmdemo.service;
import com.example.ssmdemo.domain.Student;

import java.util.List;

public interface IstudentService {

    void add(String name);
    void del(long id);
    void upd(Student stu);
    Student get(Long id);
    List<Student> list();
}
