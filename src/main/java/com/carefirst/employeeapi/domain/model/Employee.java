package com.carefirst.employeeapi.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;

	private String lastName;

	private String emailAddress;

	private String phone;

	private LocalDate birthDate;

	private String jobTitle;

	private String department;

	private String location;

	private LocalDate startDate;

	private Long managerReportingId;
	
	 public Employee() {
	    }

	    public Employee(String firstName, String lastName, String emailAddress, String phone, LocalDate birthDate, String jobTitle, String department, String location, LocalDate startDate, Long managerReportingId) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.emailAddress = emailAddress;
	        this.phone = phone;
	        this.birthDate = birthDate;
	        this.jobTitle = jobTitle;
	        this.department = department;
	        this.location = location;
	        this.startDate = startDate;
	        this.managerReportingId = managerReportingId;
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

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	     public LocalDate getBirthDate() {
	        return birthDate;
	    }

	    public void setBirthDate(LocalDate birthDate) {
	        this.birthDate = birthDate;
	    }

	    public String getJobTitle() {
	        return jobTitle;
	    }

	    public void setJobTitle(String jobTitle) {
	        this.jobTitle = jobTitle;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	     public LocalDate getStartDate() {
	        return startDate;
	    }

	    public void setStartDate(LocalDate startDate) {
	        this.startDate = startDate;
	    }

	    public Long getManagerReportingId() {
	        return managerReportingId;
	    }

	    public void setManagerReportingId(Long managerReportingId) {
	        this.managerReportingId = managerReportingId;
      }
}
