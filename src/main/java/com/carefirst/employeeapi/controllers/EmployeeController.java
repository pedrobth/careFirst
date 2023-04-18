package com.carefirst.employeeapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carefirst.employeeapi.application.EmployeeApplication;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private final EmployeeApplication employeeApp;
	
	public EmployeeController(EmployeeApplication employeeApp) {
		this.employeeApp = employeeApp;
	}
	
    @GetMapping
    public List<String> getAllEmployees(){
    	return employeeApp.getAll();
    }
}
