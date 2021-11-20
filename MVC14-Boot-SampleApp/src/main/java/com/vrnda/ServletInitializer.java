package com.vrnda;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	
	public ServletInitializer() {
		System.out.println("ServletInitializer.ServletInitializer()");
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Mvc14BootSampleAppApplication.class);
	}

}
