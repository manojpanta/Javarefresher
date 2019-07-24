package com.manojpanta;

import com.manojpanta.Entity.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void ShouldReturnStudent() {

        Student manoj = new Student(2, "manoj", "this is course", 4);
        assertEquals("manoj", manoj.getName());
    }

    @Test
    public void ShouldReturnCourseForStudent() {
        Student jack = new Student(3, "Jack", "computer science", 4);
        assertEquals("computer science", jack.getCourse());
    }

    @Test
    public void ShouldReturnIdForStudent() {
        Student jack = new Student(3, "Jack", "computer science", 4);
        assertEquals(3, jack.getId());
    }

    @Test
    public void ShouldReturnAverageScoreForStudent() {
        Student jack = new Student(3, "Jack", "computer science", 4);
        assertEquals(4, jack.getAverageScore());
    }

    @Test
    public void DemonstrateBoolean() {
        boolean friday = true;
        int i = 3;
        int j = 4;
        boolean boole = i ==j;

        if(!boole) {
            System.out.print("not manoj");

        }else if (boole) {
            System.out.print("manoj");

        }else if(friday){
            System.out.print("manoj for sure");
        }else {
            System.out.print("its Friday");
        }

    }

}
