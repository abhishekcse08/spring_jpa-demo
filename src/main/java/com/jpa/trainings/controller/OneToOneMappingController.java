package com.jpa.trainings.controller;

import com.jpa.trainings.entities.Employee;
import com.jpa.trainings.entities.Organization;
import com.jpa.trainings.service.EmployeeOrganizatioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneToOneMappingController {

    @Autowired
    EmployeeOrganizatioService employeeOrganizatioService;

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployeeData(@PathVariable Long id){

        return new ResponseEntity<>(employeeOrganizatioService.getEmployee(id), HttpStatus.OK);
    }

    @GetMapping("/getOrg/{id}")
    public ResponseEntity<Organization> getOrgData(@PathVariable Long id){

        return new ResponseEntity<>(employeeOrganizatioService.getOrg(id), HttpStatus.OK);
    }
}
