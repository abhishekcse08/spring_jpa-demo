package com.jpa.trainings.oneToManyUni;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private int roll;

    public Student(int roll) {
        this.roll = roll;
    }

    public Long getId() {
        return id;
    }

    public int getRoll() {
        return roll;
    }
}
