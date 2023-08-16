package com.jpa.trainings.repository;

import com.jpa.trainings.manyToMany.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Courses,Long> {
}
