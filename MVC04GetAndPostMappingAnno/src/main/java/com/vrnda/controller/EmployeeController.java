package com.vrnda.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@Autowired 
	private ServletContext sc;
	
	@Autowired
	private ServletConfig config;
	
	@GetMapping(value = "/defaultObjects")
	public String saveEmployee(HttpServletRequest req,HttpServletResponse res) {
		System.out.println(sc.getClass().getName());
		System.out.println(config.getClass().getName());
		System.out.println(config.getInitParameter("contextConfigLocation"));
		System.out.println(req.getClass().getName());
		System.out.println(res.getClass().getName());
		return "result";
	}
	
	
	@GetMapping("fruits")
	public String fruitsHandler(Model model) {
		List<String> fruits=Arrays.asList("Mango","Banana","Apple");
		model.addAttribute("items", fruits);
		return "result";
	}
	
	@GetMapping(value = "/phones")
	public String updateEmployee(Model model) {
		List<Long> phones=Arrays.asList(44444l,88888l,99999l);
		model.addAttribute("items", phones);
		return "result";
	}
	
	@GetMapping(value = "/colours")
	public String getEmployee(Model model) {
		List<String> fruits=Arrays.asList("Blue","Black","Pink");
		model.addAttribute("items", fruits);
		return "result";
	}


}
