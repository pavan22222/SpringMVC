package com.vrnda.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishMessageService {
	
	@Autowired
	private LocalTime time;
	
	public String getWishMessage(String user) {
		String wishMsg=null;
		Integer hour=time.getHour();
		if(hour < 12)
			wishMsg="Good Morning";
		else if(hour < 16)
			wishMsg="Good AfterNoon";
		if(hour < 20) 
			wishMsg="Good Evening";
		else 
			wishMsg="Good Morning";
		return wishMsg+"::"+user;
	}
}
