package com.vrnda.repository;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vrnda.dto.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@Autowired
	@Qualifier("prop")
	private Properties properties;
	
	public Integer getEmployeeId() {
		return template.queryForObject(properties.getProperty("query_get_emp_id"),new MapSqlParameterSource(),Integer.class);
	}
	
	public Employee getEmployeeById() {
		Employee retVal=null;
		try {
			retVal= template.queryForObject(properties.getProperty("query_get_employee"),new MapSqlParameterSource(),Employee.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	public List<Employee> getAllEmployees() {
		List<Employee> retVal=null;
		try {
			retVal= template.query(properties.getProperty("query_get_all_employees"),new MapSqlParameterSource(),new BeanPropertyRowMapper<Employee>(Employee.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
}
