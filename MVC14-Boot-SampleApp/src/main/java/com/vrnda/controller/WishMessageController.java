package com.vrnda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vrnda.service.WishMessageService;
@Controller
public class WishMessageController {
	@Autowired
	private WishMessageService service;
	
	@GetMapping("/welcome")
	public String welcomeHandler() {
		return "welcome";
	}
	
	@GetMapping("/wish")
	public String wishHandler(Model model) {
		model.addAttribute("msg", service.getMessage());
		return "wish";
	}
}
