package com.jpa.trainings.repository;

import com.jpa.trainings.oneToManyUni.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
