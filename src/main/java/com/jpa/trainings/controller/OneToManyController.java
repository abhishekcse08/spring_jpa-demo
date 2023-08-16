package com.jpa.trainings.controller;

import com.jpa.trainings.oneToManyUni.Student;
import com.jpa.trainings.oneToManyUni.University;
import com.jpa.trainings.repository.StudentRepository;
import com.jpa.trainings.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class OneToManyController {

    @Autowired
    UniversityRepository universityRepository;

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/save")
    public void saveData(){

        Student st = new Student(003);
        Student st1 = new Student(004);

        List<Student> list = Arrays.asList(st,st1);

        University uni = new University("Osmania",list);
        universityRepository.save(uni);

    }

    @GetMapping("/getInfo/{id}")
    public ResponseEntity<University> getInfo(@PathVariable Long id){

       return new ResponseEntity<>(universityRepository.findById(id).get(), HttpStatus.OK);

    }
}
