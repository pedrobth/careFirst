package com.carefirst.employeeapi.application.dto;

import com.carefirst.employeeapi.domain.model.Employee;

public class EmployeeDto {

	private Long id;

	private String firstName;

	private String lastName;

	private String emailAddress;

	private String jobTitle;

	public EmployeeDto() {
	}

	public EmployeeDto(Long id, String firstName, String lastName, String emailAddress, String jobTitle) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmailAddress(emailAddress);
		this.setJobTitle(jobTitle);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public static EmployeeDto castToEmployeeDto(Employee employee) {
		return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(),
				employee.getEmailAddress(), employee.getJobTitle());
	}
}
