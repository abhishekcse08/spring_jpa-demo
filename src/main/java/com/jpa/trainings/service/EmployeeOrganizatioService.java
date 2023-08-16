package com.jpa.trainings.service;

import com.jpa.trainings.entities.Employee;
import com.jpa.trainings.entities.Organization;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeOrganizatioService {

    public void setEmployee(Employee e);
    public Employee getEmployee(Long e);

    public void setOrg(Organization e);
    public Organization getOrg(Long e);
}
