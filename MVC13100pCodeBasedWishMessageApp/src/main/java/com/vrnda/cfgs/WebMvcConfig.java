package com.vrnda.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = "com.vrnda.controller")
public class WebMvcConfig {
	
	//@Bean
	public InternalResourceViewResolver getIrvr() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/Pages/");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}
}
