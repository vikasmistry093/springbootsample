package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping(value="/")
	public String indexPage() {
		System.out.println("Hello World");
		return "test";
	}
	
	@RequestMapping(value="/index")
	public String welcome() {
		System.out.println("Hello World");
		return "index";
	}
	
	@RequestMapping(value="/productInfo")
	public String productInfo() {
		System.out.println("Product Info Page");
		return "productInfo";
	}
	
}
