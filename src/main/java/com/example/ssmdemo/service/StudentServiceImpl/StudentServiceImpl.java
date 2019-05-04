package com.example.ssmdemo.service.StudentServiceImpl;

import com.example.ssmdemo.dao.StudentDao;
import com.example.ssmdemo.domain.Student;
import com.example.ssmdemo.service.IstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements IstudentService {
    @Autowired
    StudentDao dao;
    @Override
    public void add(String name) {

        dao.add(name);
    }
    @Override
    public void del(long id) {

        dao.del(id);
    }
    @Override
    public void upd(Student stu) {

        dao.upd(stu);
    }
    @Override
    public Student get(Long id) {

        return dao.get(id);
    }
    @Override
    public List<Student> list() {

        return dao.list();
    }
}
