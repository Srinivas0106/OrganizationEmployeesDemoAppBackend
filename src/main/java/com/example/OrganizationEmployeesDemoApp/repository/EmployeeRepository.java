package com.example.OrganizationEmployeesDemoApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OrganizationEmployeesDemoApp.model.Employee;
import com.example.OrganizationEmployeesDemoApp.model.Organization;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
    List<Employee> findByOrganization(Organization organization);
    
    Employee findByEmail(String email);
}

