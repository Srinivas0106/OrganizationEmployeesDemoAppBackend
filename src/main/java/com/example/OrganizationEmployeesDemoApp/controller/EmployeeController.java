package com.example.OrganizationEmployeesDemoApp.controller;

import org.springframework.web.bind.annotation.*;

import com.example.OrganizationEmployeesDemoApp.model.Employee;
import com.example.OrganizationEmployeesDemoApp.model.Organization;
import com.example.OrganizationEmployeesDemoApp.service.EmployeeService;
import com.example.OrganizationEmployeesDemoApp.service.OrganizationService;

import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
	
	private final EmployeeService empService;
	private final OrganizationService orgService;

	public EmployeeController(EmployeeService empService, OrganizationService orgService) {
		this.empService = empService;
		this.orgService = orgService;
	}

	@PostMapping
	public String addEmployee(@RequestParam String name, @RequestParam String role,
	                          @RequestParam String email, @RequestParam String orgName) {

	    Organization org = orgService.getByName(orgName);
	    
	    if (org == null) {
	        return "Organization not found";
	    }

	    Employee emp = new Employee(name, role, org);
	    
	    emp.setEmail(email);
	   
	    return empService.saveEmployee(emp);
	}


	@GetMapping("/byOrg/{orgName}")
	
	public List<Employee> getEmployeesByOrg(@PathVariable String orgName) {
		
		 Organization org = orgService.getByName(orgName);
		 if (org == null) { 
		        return List.of();
		    }
		 
		return empService.getEmployeesByOrganization(org);
	}
}
