package com.manojpanta.Entity;

public class Student {
    private int id;
    private String name;
    private String course;
    private int averageScore;

    public Student(int id, String name, String course, int averageScore) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.averageScore = averageScore;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}