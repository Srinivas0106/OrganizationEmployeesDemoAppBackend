package com.example.OrganizationEmployeesDemoApp.controller;

import org.springframework.web.bind.annotation.*;

import com.example.OrganizationEmployeesDemoApp.model.Organization;
import com.example.OrganizationEmployeesDemoApp.service.OrganizationService;

@RestController
@RequestMapping("/organizations")
@CrossOrigin(origins = "http://localhost:3000")
public class OrganizationController {
	private final OrganizationService orgService;

	public OrganizationController(OrganizationService orgService) {
		this.orgService = orgService;
	}

	@PostMapping
	public Organization addOrganization(@RequestBody Organization org) {
		
		return orgService.saveOrganization(org);
		
	}

	@GetMapping("/{name}")
	public Organization getOrganization(@PathVariable String name) {
		
		return orgService.getByName(name);
	}
}
