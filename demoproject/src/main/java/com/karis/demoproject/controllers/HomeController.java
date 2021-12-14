package com.karis.demoproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HomeController {

	@RequestMapping("/")
	public String hello() {
		return "Welcome to Spring";
	}
	
	@RequestMapping("/java")
	public String welcome() {
		return "Welcome to Java";
	}
}
