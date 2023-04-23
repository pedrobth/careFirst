package com.carefirst.employeeapi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.carefirst.employeeapi.application.EmployeeApplication;
import com.carefirst.employeeapi.application.dto.EmployeeCreatedDto;
import com.carefirst.employeeapi.application.dto.EmployeeDto;
import com.carefirst.employeeapi.controllers.exceptions.NotFoundException;
import com.carefirst.employeeapi.domain.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private final EmployeeApplication employeeApp;

	public EmployeeController(EmployeeApplication employeeApp) {
		this.employeeApp = employeeApp;
	}

	@GetMapping
	public List<EmployeeDto> getAllEmployees() {
		return employeeApp.getAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee employeeResponse = employeeApp.getById(id);
		if (employeeResponse == null) {
			throw new NotFoundException("User could not be found with id: " +id);
		}
		
		return ResponseEntity.ok(employeeResponse);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public EmployeeCreatedDto insertEmployee(@RequestBody Employee employee) {
		return employeeApp.saveEmployee(employee);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PutMapping("/{id}")
	// handle not existing employee, could create one, or return not found
	public EmployeeCreatedDto updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		EmployeeCreatedDto employeeResponse = employeeApp.updateEmployee(id, employee);
		if (employeeResponse == null) {
			throw new NotFoundException("The user with the id: " + id + " was not found. Please try again with a valid ID or use the POST method at baseUrl/employees route.");
		}
		
		return employeeResponse;
	}

	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		if (employeeApp.deleteEmployee(id) == null) {
			throw new NotFoundException("User could not be found with id: "  + id);
		}

		return " =[ You just fired: " + id;
	}
}
