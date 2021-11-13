package com.vrnda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vrnda.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/login")
	public String logInHandler() {
		return "login";
	}
	
	@PostMapping("/validate")
	public String validateCredentials(Model model,@RequestParam String username,@RequestParam String password) {
		try {
			model.addAttribute("result", service.validateCredentials(username, password));
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("result", 2);
		}
			return "login";
	}
}
