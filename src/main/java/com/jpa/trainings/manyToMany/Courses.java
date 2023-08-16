package com.jpa.trainings.manyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "courses")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Courses {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int chapter;
    private double fee;
    private String author;

    @ManyToMany(mappedBy = "courses",fetch = FetchType.EAGER)
    private Set<StudentCollege> students;



}
