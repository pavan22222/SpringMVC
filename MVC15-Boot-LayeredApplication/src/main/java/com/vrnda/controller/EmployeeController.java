package com.vrnda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.vrnda.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/home")
	public String homeHandler() {
		String s=null;
		//s.toString();
		return "home";
	}
	
	@GetMapping("/getAllEmployees")
	public String getAllEmployeesHandler(ModelMap model) {
		model.addAttribute("employees", service.getAllEmployees());
		model.addAttribute("name", "Pavan");
		return "employees_list";
	}
	
	@GetMapping("/error")
	public String errorHandler() {
		return "error";
	}
}
