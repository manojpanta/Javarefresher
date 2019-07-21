package com.manojpanta.Service;

import com.manojpanta.Dao.StudentDao;
import com.manojpanta.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();

    }
    public Student getStudentByid(int id) {
        return this.studentDao.getStudentByid(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }
}
