package com.vrnda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrnda.repostiory.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Integer validateCredentials(String username, String password) {
		return repository.validateCredentials(username, password);
	}
	
	

}
