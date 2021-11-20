package com.vrnda.controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vrnda.dto.Student;

@Controller
@PropertySource("classpath:/application.properties")
public class StudentController {
	
	@GetMapping("/home")
	public String homeHandler() {
		return "home";
	}
	
	@GetMapping("/register")
	public String registerGetHandler(@ModelAttribute Student st) {
		return "register";
	}
	
	@PostMapping("/register")
	public String registerPostHandler(@ModelAttribute Student st,RedirectAttributes redirect) {
		redirect.addFlashAttribute("result", st);
		return "redirect:result";
	}
	
	@GetMapping("/result")
	public String registerGetHandler(Model model) {
		return "result";
	}
	
	@ModelAttribute("hobbiesList")
	public List<String> getHobbies(){
		return List.of("Reading", "Playing", "Listsenting to Music");
	}
	
	@ModelAttribute("genders")
	public List<Character> getGenders(){
		return List.of('M','F');
	}
	
	
	@ModelAttribute("colorsList")
	public List<String> getColors(){
		return List.of("Blue", "Pink", "Red","Black");
	}
	
	@InitBinder
	public void initHandler(ServletRequestDataBinder binder) {
		System.out.println("StudentController.initHandler()");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf, true));
		
	}
}
