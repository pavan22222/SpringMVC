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
	public List<Employee> getAllEmployees() {
		return repository.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		return repository.getEmployeeById(empId);
	}

	@Override
	public Integer saveEmployee(Employee emp) {
		return repository.saveEmployee(emp);
	}

	@Override
	public Integer updateEmployee(Employee emp) {
		return repository.updateEmployee(emp);
	}

	@Override
	public Integer deleteEmployee(Integer empId) {
		return repository.deleteEmployee(empId);
	}

	@Override
	public List<Integer> getDeptNos() {
		return repository.getDeptNos();
	}

	@Override
	public Integer getEmpId() {
		return repository.getEmpId();
	}

}
