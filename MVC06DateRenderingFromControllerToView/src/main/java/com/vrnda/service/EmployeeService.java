package com.vrnda.service;

import java.util.List;

import com.vrnda.beans.Employee;

public interface EmployeeService {
	
	Integer save(Employee emp);
	List<Employee> getAllEmployees();
}
