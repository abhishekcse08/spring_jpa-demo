package com.jpa.trainings.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Organization")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Organization {


    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;

    @OneToOne
    @JoinColumn(name = "emp_id",referencedColumnName = "id")
    private Employee emp;
}
