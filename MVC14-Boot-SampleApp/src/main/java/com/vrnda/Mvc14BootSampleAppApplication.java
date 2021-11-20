package com.vrnda;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Mvc14BootSampleAppApplication {
	
	
	public Mvc14BootSampleAppApplication() {
		System.out.println("Mvc14BootSampleAppApplication.Mvc14BootSampleAppApplication()");
	}
	@Bean
	public LocalTime getLocalDate() {
		return LocalTime.now();
	}
	
	public static void main(String[] args) {
		System.out.println("Mvc14BootSampleAppApplication.main()");
		SpringApplication.run(Mvc14BootSampleAppApplication.class, args);
	}

}
