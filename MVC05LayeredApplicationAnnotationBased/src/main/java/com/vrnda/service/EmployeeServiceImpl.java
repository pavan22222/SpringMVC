package com.vrnda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrnda.dto.Employee;
import com.vrnda.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getEmployees() {
		return repository.getEmployees();
	}
}
