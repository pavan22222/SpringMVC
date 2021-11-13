package com.vrnda.repostiory;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Integer validateCredentials(String username, String password) {
		MapSqlParameterSource in=new MapSqlParameterSource();
		in.addValue("USER_NAME", username);
		in.addValue("PASS_WORD", password);
		simpleJdbcCall.withFunctionName("VALIDATE_CREDENTIALS");
		return (simpleJdbcCall.executeFunction(BigDecimal.class, in)).intValue();
	}
	

}
