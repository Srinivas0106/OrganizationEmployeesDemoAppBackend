package com.example.OrganizationEmployeesDemoApp.service;

import org.springframework.stereotype.Service;

import com.example.OrganizationEmployeesDemoApp.model.Organization;
import com.example.OrganizationEmployeesDemoApp.repository.OrganizationRepository;

@Service
public class OrganizationService {
    private final OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public Organization saveOrganization(Organization org) {
    	
    	 Organization existing = organizationRepository.findByNameIgnoreCase(org.getName());
    	 
    	    if (existing != null) {
    	    	
    	        return existing;
    	    }
    	    
        return organizationRepository.save(org);
    }

    public Organization getByName(String name) {
    	
    	if (name == null) return null;
    	
        return organizationRepository.findByNameIgnoreCase(name.trim());
    }
}

