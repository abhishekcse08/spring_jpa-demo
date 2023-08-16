package com.jpa.trainings.repository;

import com.jpa.trainings.manyToMany.StudentCollege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCollegeRepository extends JpaRepository<StudentCollege,Long> {
}
