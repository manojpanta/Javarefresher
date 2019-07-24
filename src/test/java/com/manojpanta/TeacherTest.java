package com.manojpanta;

import com.manojpanta.Entity.Student;
import com.manojpanta.Entity.Teacher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class TeacherTest {

    @Test

    public void ShouldReturnAllTheStudents() {
        Student manoj = new Student(1, "manoj", "science");
        Object jack = new Student(2, "jack", "engineering");
        Object tyler = new Student(3, "tyler", "computer science");
        ArrayList students = new ArrayList();
        students.add(manoj);
        students.add(jack);
        students.add(tyler);
        Teacher teacher = new Teacher("manoj", students);
        assertEquals("manoj", teacher.getName());
        assertEquals(3, teacher.getStudents().size());
    }

}
