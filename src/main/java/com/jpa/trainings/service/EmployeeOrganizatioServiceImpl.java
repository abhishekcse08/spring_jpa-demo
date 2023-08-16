package com.jpa.trainings.service;

import com.jpa.trainings.entities.Employee;
import com.jpa.trainings.entities.Organization;
import com.jpa.trainings.repository.EmployeeRepository;
import com.jpa.trainings.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOrganizatioServiceImpl implements EmployeeOrganizatioService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public void setEmployee(Employee e) {

        employeeRepository.save(e);

    }

    @Override
    public Employee getEmployee(Long e) {
        return employeeRepository.findById(e).get();
    }

    @Override
    public void setOrg(Organization e) {
        organizationRepository.save(e);
    }

    @Override
    public Organization getOrg(Long e) {
        return organizationRepository.findById(e).get();
    }
}
