package com.manojpanta.Entity;

import java.util.ArrayList;
import java.util.Collection;

public class Teacher {
    private String name;
    private ArrayList<Student> students;

    public Teacher(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int averageScoreOf(Student student) {
        return student.getAverageScore();
    }
}
