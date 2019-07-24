package com.manojpanta.Entity;

import java.util.Collection;

public class Teacher {
    private String name;
    private Collection<Student> students;

    public Teacher(String name, Collection<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }
}
