package com.manojpanta;

import com.manojpanta.Entity.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void ShouldReturnStudent() {

        Student manoj = new Student(2, "manoj", "this is course");
        assertEquals("manoj", manoj.getName());
    }

    @Test
    public void ShouldReturnCourseForStudent() {
        Student jack = new Student(3, "Jack", "computer science");
        assertEquals("computer science", jack.getCourse());
    }

    @Test
    public void ShouldReturnIdForStudent() {
        Student jack = new Student(3, "Jack", "computer science");
        assertEquals(3, jack.getId());
    }

}
