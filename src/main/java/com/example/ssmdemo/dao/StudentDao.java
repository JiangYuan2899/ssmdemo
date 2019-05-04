package com.example.ssmdemo.dao;

import com.example.ssmdemo.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface StudentDao {
    //add测试
    @Insert("insert into students(name) value(#{name})")
    void add(String name);
    //delete
    @Delete("delete from students where id =#{id}")
    void del(long id);
    //update
    @Update("update students set name = #{name} where id =#{id}")
    void upd(Student stu);
    //select(id)
    @Select("SELECT * FROM students where id=#{id}")
    Student get(Long id);
    // select all
    @Select("SELECT * FROM students")
    List<Student> list();

}
