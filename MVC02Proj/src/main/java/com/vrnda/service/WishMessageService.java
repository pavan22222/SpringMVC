package com.vrnda.service;

import java.util.Date;

public class WishMessageService {
	
	
	
	public WishMessageService() {
		System.out.println("WishMessageService 0-Param Constructor");
	}

	public String  getWishMessage() {
		System.out.println("WishMessageService.getWishMessage()");
		Date date=new Date();
		if(date.getHours() <12)
			return "Good Morning";
		else if(date.getHours() <16)
			return "Good Afternoon";
		else if(date.getHours() < 20)
			return "Good Evening";
		else
			return "Good Night";
					
		
	}
}
