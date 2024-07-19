package com.firstproject.employeeapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
// id, name, email, bloodgroup
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name= "id")
	private int id;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodgroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodgroup = bloodGroup;
	}

	@Column (name= "name")
	private String name;
	
	@Column (name= "email")
	private String email;
	
	@Column (name= "bloodgroup")
	private String bloodgroup;

}
