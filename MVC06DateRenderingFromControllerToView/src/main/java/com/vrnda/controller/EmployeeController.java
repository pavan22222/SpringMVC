package com.vrnda.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vrnda.beans.Employee;
import com.vrnda.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/register")
	public String register(Model model) {
		Employee emp=new Employee();
		emp.setSalary(20000.0f);
		model.addAttribute("empForm", emp);
		return "register";
	}
	
	@GetMapping("/home")
	public String homeHandler() {
		return "/home";
	}
	
	@PostMapping("/register")
	public String register(Model model,@ModelAttribute() Employee emp) {
		Integer result=0;
		try {
			result=service.save(emp);
		}catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("result",result);
		return "result";
	}
	
	@GetMapping("/getEmployees")
	public String getAllEmployees(Map<String,Object> map) {
		map.put("empList", service.getAllEmployees());
		return "emplist";
	}
}
