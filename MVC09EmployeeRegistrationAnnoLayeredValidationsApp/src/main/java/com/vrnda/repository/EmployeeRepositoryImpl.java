package com.vrnda.repository;

import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jndi.JndiTemplate;
import org.springframework.stereotype.Repository;

import com.vrnda.dto.Employee;
@Repository
@PropertySource("classpath:/com/vrnda/commons/application.properties")
public class EmployeeRepositoryImpl implements EmployeeRepository{
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	private Properties properties;
	
	public EmployeeRepositoryImpl() {
		System.out.println("EmployeeRepositoryImpl 0-Param Constructor");
		properties=new Properties();
		try {
			properties.load(new FileInputStream("F:\\Properties\\application.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	@Override
	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query(properties.getProperty("all_select_query"), new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		return jdbcTemplate.queryForObject(properties.getProperty("single_select_query"), Map.of("id",empId), new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Integer saveEmployee(Employee emp) {
		return jdbcTemplate.update(properties.getProperty("insert_query"), new BeanPropertySqlParameterSource(emp));
	}

	@Override
	public Integer updateEmployee(Employee emp) {
		return jdbcTemplate.update(properties.getProperty("update_query"), new BeanPropertySqlParameterSource(emp));
	}

	@Override
	public Integer deleteEmployee(Integer empId) {
		return jdbcTemplate.update(properties.getProperty("delete_query"), Map.of("id",empId));
	}

	@Override
	public List<Integer> getDeptNos() {
		List<Integer> list=null;
		try{
			list=jdbcTemplate.query(properties.getProperty("select_deptnos"), mapper);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private RowMapper mapper= new RowMapper(){
		@Override
		public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
			return rs.getInt(1);
		}
		
	};

	@Override
	public Integer getEmpId() {
		return jdbcTemplate.queryForObject(properties.getProperty("select_employee_id"),new HashMap(),Integer.class);
	}

}
