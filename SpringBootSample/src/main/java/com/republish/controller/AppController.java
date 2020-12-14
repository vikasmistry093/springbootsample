package com.republish.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.republish.service.RepublishService;

@Controller
public class AppController {
	
	@Autowired
	RepublishService service;
	
	@RequestMapping(value="/")
	public ModelAndView welcome(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("index");
		
		return model;
	}
	
	@RequestMapping(value="/productInfo/{id}")
	public ModelAndView productInfo(@PathVariable("id") String id, HttpServletRequest request) {
		System.out.println("Product Info Page");
		ModelAndView model = new ModelAndView("productInfo");
		
		return model;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest request) {
		System.out.println("Product Info Page");
		ModelAndView model = new ModelAndView("login");
		
		return model;
	}
	
	@RequestMapping(value="/signup")
	public ModelAndView signup(HttpServletRequest request) {
		System.out.println("Sign Up Page");
		ModelAndView model = new ModelAndView("signup");
		
		return model;
	}
	
	@RequestMapping(value="/orderInfo")
	public ModelAndView orderInfo(HttpServletRequest request) {
		System.out.println("orderInfo Page");
		ModelAndView model = new ModelAndView("signup");
		
		return model;
	}
	
	@RequestMapping(value="/orderSuccess")
	public ModelAndView orderSuccess(HttpServletRequest request) {
		System.out.println("orderSuccess Page");
		ModelAndView model = new ModelAndView("signup");
		
		return model;
	}
	
}
