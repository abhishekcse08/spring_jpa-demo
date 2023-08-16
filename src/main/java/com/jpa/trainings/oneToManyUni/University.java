package com.jpa.trainings.oneToManyUni;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "university_id")
    private List<Student> studentList = new ArrayList<>();

    public University(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public University() {
    }

    public String getName() {
        return name;
    }



    public List<Student> getStudentList() {
        return studentList;
    }
}
