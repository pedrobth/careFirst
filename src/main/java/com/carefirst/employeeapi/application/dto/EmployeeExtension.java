package com.carefirst.employeeapi.application.dto;

import com.carefirst.employeeapi.domain.model.Employee;

public class EmployeeExtension {
    public static void updateValidProperties(Employee existingEmployee, Employee employee) {
        if (employee.getFirstName() != null) {
            existingEmployee.setFirstName(employee.getFirstName());
        }
        if (employee.getLastName() != null) {
            existingEmployee.setLastName(employee.getLastName());
        }
        if (employee.getEmailAddress() != null) {
            existingEmployee.setEmailAddress(employee.getEmailAddress());
        }
        if (employee.getPhone() != null) {
            existingEmployee.setPhone(employee.getPhone());
        }
        if (employee.getBirthDate() != null) {
            existingEmployee.setBirthDate(employee.getBirthDate());
        }
        if (employee.getJobTitle() != null) {
            existingEmployee.setJobTitle(employee.getJobTitle());
        }
        if (employee.getDepartment() != null) {
            existingEmployee.setDepartment(employee.getDepartment());
        }
        if (employee.getLocation() != null) {
            existingEmployee.setLocation(employee.getLocation());
        }
        if (employee.getStartDate() != null) {
            existingEmployee.setStartDate(employee.getStartDate());
        }
        if (employee.getManagerReportingId() != null) {
            existingEmployee.setManagerReportingId(employee.getManagerReportingId());
        }
    }
}

