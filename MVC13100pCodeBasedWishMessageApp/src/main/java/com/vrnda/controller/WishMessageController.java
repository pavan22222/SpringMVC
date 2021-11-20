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
	
	@GetMapping("/home")
	public String homeHandler() {
		return "home";
	}
	
	@GetMapping("/message")
	public String messageHandler(Model model) {
		model.addAttribute("message", service.getWishMessage("Pavan"));
		return "message";
	}
}
