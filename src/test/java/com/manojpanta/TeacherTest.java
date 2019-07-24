package com.manojpanta;

import com.manojpanta.Entity.Student;
import com.manojpanta.Entity.Teacher;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TeacherTest {

    @Test
    public void ShouldReturnAllTheStudents() {
        Student manoj = new Student(1, "manoj", "science", 4);
        Student jack = new Student(2, "jack", "engineering", 4);
        Object tyler = new Student(3, "tyler", "computer science", 4);
        ArrayList students = new ArrayList();
        students.add(manoj);
        students.add(jack);
        students.add(tyler);
        Teacher teacher = new Teacher("manoj", students);

        assertEquals("manoj", teacher.getName());
        assertEquals(3, teacher.getStudents().size());
    }

    @Test
    public void ShouldReturnAverageScoreForAStudent() {
        Student manoj = new Student(1, "manoj", "science", 4);
        Object jack = new Student(2, "jack", "engineering", 3);
        Object tyler = new Student(3, "tyler", "computer science", 2);
        ArrayList students = new ArrayList();
        students.add(manoj);
        students.add(jack);
        students.add(tyler);
        Teacher teacher = new Teacher("manoj", students);
        assertEquals(4, teacher.averageScoreOf(manoj));
    }

    @Test
    public void ShouldReturnTotalStudents() {
        Student manoj = new Student(1, "manoj", "science", 4);
        Object jack = new Student(2, "jack", "engineering", 3);
        Object tyler = new Student(3, "tyler", "computer science", 2);
        ArrayList students = new ArrayList();
        students.add(manoj);
        students.add(jack);
        students.add(tyler);
        Teacher teacher = new Teacher("manoj", students);
        assertEquals(3, teacher.totalStudents());
    }

    @Test
    public void ShouldReturnNuberOfStudentsInLoop() {
        ArrayList students = new ArrayList();
        int counter = 0;
        for( int i =0;i< 4; i++ ){
            Student manoj = new Student(1, "manoj", "science", 4);
            students.add(manoj);
        }

        while(counter < 100) {
            System.out.print("Still Running");
            counter ++;
        }
        assertEquals(4, students.size());
    }

    @Test
    public void demonstrateArrays() {
        int[] numbers = new int[3];
        numbers[0] = 3;
        numbers[1]= 1;
        numbers[2] = 0;

        for(int number: numbers) {
            System.out.print("will score" + number);
        }


    }

}
