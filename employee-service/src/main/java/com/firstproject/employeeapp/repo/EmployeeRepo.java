package com.firstproject.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproject.employeeapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
}


