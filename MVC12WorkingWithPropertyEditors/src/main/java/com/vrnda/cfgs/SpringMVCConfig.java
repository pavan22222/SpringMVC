package com.vrnda.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class SpringMVCConfig implements WebMvcConfigurer {
	
	
	public SpringMVCConfig() {
		System.out.println("SpringMVCConfig.SpringMVCConfig()");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("SpringMVCConfig.addResourceHandlers()");
		registry.addResourceHandler("/static/**").addResourceLocations("/resources/");
	}
}
