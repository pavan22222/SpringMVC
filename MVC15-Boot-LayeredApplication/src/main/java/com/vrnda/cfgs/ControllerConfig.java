package com.vrnda.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class ControllerConfig implements WebMvcConfigurer{
//	@Bean
//	public InternalResourceViewResolver getIrvr() {
//		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
//		irvr.setPrefix("/WEB-INF/pages/");
//		irvr.setSuffix(".jsp");
//		return irvr;
//	}
	
	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/abcd/**").addResourceLocations("/resources/");
//	}
}
