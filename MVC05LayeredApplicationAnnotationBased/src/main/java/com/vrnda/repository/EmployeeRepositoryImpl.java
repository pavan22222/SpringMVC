package com.vrnda.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.vrnda.dto.Employee;
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
	private final String SELECT_QUERY="select * from employee";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> getEmployees() {
		return jdbcTemplate.query(SELECT_QUERY, mapper);
	}
	
	RowMapper mapper=new RowMapper() {
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp=new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setAge(rs.getInt(3));
			emp.setSalary(rs.getFloat(4));
			emp.setDoj(rs.getDate(5));
			return emp;
		}
	};

}
