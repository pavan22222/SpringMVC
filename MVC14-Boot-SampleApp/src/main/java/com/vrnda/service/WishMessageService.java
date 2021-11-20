package com.vrnda.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:/application.properties")
public class WishMessageService {
	
	@Autowired
	private Environment env;

	@Autowired
	private LocalTime time;
	
	@Value("${user.name}")
	private String userName;

	public String getMessage() {
		String msg = null;
		if (time.getHour() < 12)
			msg = "Goog Morning";
		else if (time.getHour() < 16)
			msg = "Goog AfterNoon";
		if (time.getHour() < 20)
			msg = "Goog Evening";
		else
			msg = "Goog Night";
		return msg+"::"+env.getProperty("user.name");
	}
}
