package com.vrnda.cfgs;

import java.io.FileInputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jndi.JndiTemplate;

@Configuration
public class RepositoryConfig {
	
//	@Autowired
//	private DataSource dataSource;
//	
//	@Bean 
//	public NamedParameterJdbcTemplate getJdbcTemplate() throws Exception {
//		JndiTemplate template=new JndiTemplate();
//		//DataSource ds=template.lookup("java:/comp/env/PavanJndi", DataSource.class);
//		return new NamedParameterJdbcTemplate(dataSource);
//	}
//	
	@Bean("prop")
	public Properties getProperties() throws Exception {
		Properties properties=new Properties();
		properties.load(new ClassPathResource("queries.properties").getInputStream());
		return properties;
	}
}
