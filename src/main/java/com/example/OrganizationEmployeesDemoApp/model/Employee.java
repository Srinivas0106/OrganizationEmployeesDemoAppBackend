package com.example.OrganizationEmployeesDemoApp.model;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String role;
    @Column(unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name="org_id")
    private Organization organization;

    public Employee() {}

    public Employee(String name, String role, Organization organization) {
        this.name = name;
        this.role = role;
        this.organization = organization;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

    	
}
