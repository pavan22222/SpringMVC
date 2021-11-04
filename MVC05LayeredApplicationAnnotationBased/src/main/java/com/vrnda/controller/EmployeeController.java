package com.vrnda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vrnda.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/home")
	public String homeHandler() {
		return "home";
	}
	
	@RequestMapping(value = "employees",method = RequestMethod.GET)
	public String employeesHandler(Model model) {
		model.addAttribute("empList", service.getEmployees());
		return "result";
	}
}
