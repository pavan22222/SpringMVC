package com.vrnda.repository;

import java.util.List;

import com.vrnda.beans.Employee;

public interface EmployeeRepository {
	
	Integer save(Employee emp);
	List<Employee> getAllEmployees();
}
