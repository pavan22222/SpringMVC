package com.vrnda.repository;

import java.util.List;

import com.vrnda.dto.Employee;

public interface EmployeeRepository {
	List<Employee> getEmployees();
}
