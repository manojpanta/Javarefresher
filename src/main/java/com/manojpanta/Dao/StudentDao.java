package com.manojpanta.Dao;

import com.manojpanta.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;
    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "luis", "computer Science"));
                put(2, new Student(2, "manoj", "computer Science"));
                put(3, new Student(3, "dinesh", "computer Science"));
            }

        };
    }
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }
    public Student getStudentByid(int id) {
        return this.students.get(id);
    }

    public void removeStudentById(int id) {
        this.students.remove(id);
    }
}
