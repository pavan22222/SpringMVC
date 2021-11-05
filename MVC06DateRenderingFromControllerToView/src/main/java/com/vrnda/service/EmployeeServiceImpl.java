package com.vrnda.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrnda.beans.Employee;
import com.vrnda.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Integer save(Employee emp) {
		//emp.setId(34);
		emp.setDoj(new Date());
		return repository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.getAllEmployees();
	}

}
