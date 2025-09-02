package com.example.OrganizationEmployeesDemoApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OrganizationEmployeesDemoApp.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
	
	Organization findByNameIgnoreCase(String name);

}
