package com.example.OrganizationEmployeesDemoApp.service;


import org.springframework.stereotype.Service;

import com.example.OrganizationEmployeesDemoApp.model.Employee;
import com.example.OrganizationEmployeesDemoApp.model.Organization;
import com.example.OrganizationEmployeesDemoApp.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
    	
        this.employeeRepository = employeeRepository;
    }

    public String saveEmployee(Employee emp) {
    	
    	Employee existing = employeeRepository.findByEmail(emp.getEmail());
    	
    	if (existing != null) {
    		
            return "Email already existed";
        }
    	
        employeeRepository.save(emp);
        
        return "Employee saved successfully";
    }


    public List<Employee> getEmployeesByOrganization(Organization org) {
    	
        return employeeRepository.findByOrganization(org);
    }
}
