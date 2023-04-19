package com.carefirst.employeeapi.application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.carefirst.employeeapi.application.dto.EmployeeCreatedDto;
import com.carefirst.employeeapi.application.dto.EmployeeDto;
import com.carefirst.employeeapi.application.dto.EmployeeExtension;
import com.carefirst.employeeapi.domain.model.Employee;
import com.carefirst.employeeapi.domain.repository.EmployeeRepository;

@Component
@Service
public class EmployeeApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeApplication(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<EmployeeDto> getAll() {
		List<Employee> employeeList;
		employeeList = employeeRepository.findAll();
		List<EmployeeDto> employeeDtoList = employeeList.stream().map(EmployeeDto::castToEmployeeDto)
				.collect(Collectors.toList());

		return new ArrayList<EmployeeDto>(employeeDtoList);
	}

	public Employee getById(Long id) {
		Employee employee;
		employee = employeeRepository.findById(id).get();
		return employee;		
		}
		
	
	public EmployeeCreatedDto saveEmployee(Employee employee) {
        Employee employeeCreated = employeeRepository.save(employee);
        EmployeeCreatedDto employeeCreatedDto = EmployeeCreatedDto.castToEmployeeCreatedDto(employeeCreated);
        return employeeCreatedDto;
    }

	public EmployeeCreatedDto updateEmployee(Long id, Employee employee) {
		Employee existingEmployee = employeeRepository.findById(id).get();
		if (existingEmployee instanceof Employee) {
			EmployeeExtension.updateValidProperties(existingEmployee, employee);
			employeeRepository.save(existingEmployee);
			
			EmployeeCreatedDto employeeCreatedDto = EmployeeCreatedDto.castToEmployeeCreatedDto(existingEmployee);
        return employeeCreatedDto;
		}
		return null;
	}
	
	}
