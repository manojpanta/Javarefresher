package com.manojpanta.Entity;

import javax.persistence.*;

@Entity
@Table(name= "students")
public class StudentFromDb {
    @Id
    private Long id;
    private String name;
    private int score;

    public StudentFromDb() {

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFinalScore() {
        return score;
    }

    public void setFinalScore(int finalScore) {
        this.score = finalScore;
    }
}
