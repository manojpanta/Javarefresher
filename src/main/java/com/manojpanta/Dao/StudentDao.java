package com.manojpanta.Dao;

import com.manojpanta.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;
    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "luis", "computer Science", 4));
                put(2, new Student(2, "manoj", "polytics", 4));
                put(3, new Student(3, "dinesh", "financing", 4));
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

    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());

        students.put(student.getId(), student);
    }

    public void create(Student student) {
        students.put(student.getId(), student);
    }
}
