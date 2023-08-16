package com.jpa.trainings.manyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Student_tbl")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class StudentCollege {

    @Id
    @GeneratedValue
    private Long id;

    private int rollNo;
    private String name;
    private String dept;
    private int age;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "student_course", joinColumns =
            {@JoinColumn(name = "student_id",referencedColumnName = "id"),

    },
            inverseJoinColumns = {@JoinColumn(name = "course_id",referencedColumnName = "id")}


    )


    private Set<Courses> courses;
}

