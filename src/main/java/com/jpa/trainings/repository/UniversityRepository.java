package com.jpa.trainings.repository;

import com.jpa.trainings.oneToManyUni.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University,Long> {
}
