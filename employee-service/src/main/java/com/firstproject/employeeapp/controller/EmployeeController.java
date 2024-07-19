package com.firstproject.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject.employeeapp.entity.Employee;
import com.firstproject.employeeapp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/employees/{id}")
	Employee getEmployeeDetails(@PathVariable("id") int id){
		
		//db call -> employee 1
		
		Employee employee = employeeService.getEmployeeById(id);
		
		return employee;
		
		
	}

}
