package com.carefirst.employeeapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carefirst.employeeapi.application.EmployeeApplication;
import com.carefirst.employeeapi.application.dto.EmployeeCreatedDto;
import com.carefirst.employeeapi.application.dto.EmployeeDto;
import com.carefirst.employeeapi.domain.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private final EmployeeApplication employeeApp;
	
	public EmployeeController(EmployeeApplication employeeApp) {
		this.employeeApp = employeeApp;
	}
	
    @GetMapping
    public List<EmployeeDto> getAllEmployees(){
    	return employeeApp.getAll();
    }
    
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
    	return employeeApp.getById(id);
    }
    
    @PostMapping
    public EmployeeCreatedDto insertEmployee(@RequestBody Employee employee) {
    	return employeeApp.saveEmployee(employee);
    }
    
    @PutMapping("/{id}")
    public EmployeeCreatedDto updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
    	return employeeApp.updateEmployee(id, employee);
    }
}
