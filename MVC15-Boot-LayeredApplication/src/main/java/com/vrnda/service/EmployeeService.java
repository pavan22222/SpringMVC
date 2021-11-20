package com.vrnda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrnda.dto.Employee;
import com.vrnda.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public Integer getEmployeeId() {
		return repository.getEmployeeId();
	}
	
	public Employee getEmployeeById() {
		return repository.getEmployeeById();
	}
	
	public List<Employee> getAllEmployees() {
		return repository.getAllEmployees();
	}
}
