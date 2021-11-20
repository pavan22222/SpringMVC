package com.vrnda.cfgs;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan("com.vrnda.service")
public class ServiceConfig {
	
	//@Bean
	public LocalTime getLocalDate() {
		return LocalTime.now();
	}
}
