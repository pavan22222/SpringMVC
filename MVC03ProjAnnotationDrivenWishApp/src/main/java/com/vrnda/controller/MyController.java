package com.vrnda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vrnda.service.WishMessageService;

@Controller
@RequestMapping("/")
public class MyController {

	private WishMessageService service;

	public MyController(WishMessageService service) {
		System.out.println("MyController 1-Param Constructor");
		this.service = service;
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public void defaultHandlerMethod() {
		System.out.println("I am Default Handler Method");
	}

	@RequestMapping(value = {"/home","/default"},method = {RequestMethod.GET,RequestMethod.POST})
	public String homeHandler() {
		System.out.println("MyController.homeHandler()");
		return "home";
	}

	@RequestMapping(value = "/wish",method = RequestMethod.GET)
	public String wishHandler(Model model) {
		System.out.println("MyController.wishHandler()");
		model.addAttribute("msg", service.getWishMessage());
		return "wish";
	}
	
	@RequestMapping(value = "/wish1",method = RequestMethod.GET)
	public String wish1Handler(Model model) {
		System.out.println("MyController.wish1Handler()");
		model.addAttribute("msg", service.getWishMessage());
		return "redirect:wish";
	}
}
