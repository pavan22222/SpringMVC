package com.vrnda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.vrnda.service.WishMessageService;

public class WishMessageController extends AbstractController{
	private WishMessageService service;
	
	public WishMessageController(WishMessageService service){
		System.out.println("WishMessageController 0-param constructor");
		this.service=service;
	}
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return new ModelAndView("wish","msg",service.getWishMessage());
	}

}
