package com.carefirst.employeeapi.application;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class EmployeeApplication {

	public List<String> getAll(){
		List<String> stringList = new ArrayList<>();
		stringList.add("hello world");

		return stringList;
	}
}
