package com.carefirst.employeeapi.application.dto;

import com.carefirst.employeeapi.domain.model.Employee;

public class EmployeeCreatedDto {

	private Long id;

	public EmployeeCreatedDto(Long id) {
		this.setId(id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static EmployeeCreatedDto castToEmployeeCreatedDto(Employee employee) {
		return new EmployeeCreatedDto(employee.getId());
	}
}
