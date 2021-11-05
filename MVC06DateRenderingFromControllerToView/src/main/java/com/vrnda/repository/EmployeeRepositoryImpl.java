package com.vrnda.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.stereotype.Repository;

import com.vrnda.beans.Employee;
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	private static final String  INSERT_QUERY="insert into employee values(EMP_ID.NEXTVAL,?,?,?,?)";
	private static final String SELECT_QUERY="select * from employee";
	
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	
	public EmployeeRepositoryImpl() {
		System.out.println("EmployeeRepositoryImpl 0-Param COnstructor");
	}

	@Override
	public Integer save(Employee emp) {
		Integer retVal=null;
		retVal = jdbcTemplate.update(INSERT_QUERY, emp.getName(),emp.getAge(),emp.getSalary(),emp.getDoj());
		return retVal;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> retList=null;
		try {
			retList=jdbcTemplate.query(SELECT_QUERY, new BeanPropertyRowMapper<Employee>(Employee.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retList;
	}

}
