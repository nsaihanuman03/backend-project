package com.firstproject.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject.employeeapp.entity.Employee;
import com.firstproject.employeeapp.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo EmployeeRepo;
	
	
	public Employee getEmployeeById(int id) {
		
		Employee employee = EmployeeRepo.findById(id).get();
		return employee;
	}

}
