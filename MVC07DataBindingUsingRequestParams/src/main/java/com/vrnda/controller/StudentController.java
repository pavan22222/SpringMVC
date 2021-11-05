package com.vrnda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@GetMapping("/home")
	public String homeHandler() {
		return "home";
	}
	
	@GetMapping("st")
	public String requestParams(Model model,@RequestParam("name") String[] names,@RequestParam(required = false) Integer age,@RequestParam(defaultValue = "Hyd") String addr) {
		System.out.println("Name is "+names[0]+" "+names[1]);
		model.addAttribute("name", names);
		model.addAttribute("age", age);
		model.addAttribute("addr", addr);
		return "result";
	}
}
