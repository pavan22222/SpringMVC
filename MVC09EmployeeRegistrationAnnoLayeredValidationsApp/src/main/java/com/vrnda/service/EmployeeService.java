package com.vrnda.service;

import java.util.List;

import com.vrnda.dto.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	Employee getEmployeeById(Integer empId);
	Integer saveEmployee(Employee emp);
	Integer updateEmployee(Employee emp);
	Integer deleteEmployee(Integer empId);
	List<Integer> getDeptNos();
	Integer getEmpId();
}
