package com.karis.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//	@RequestMapping("/home")
//	public String index() {
//		return "Hello Human";
//	}
//	
	@RequestMapping("/")
	public String name(@RequestParam(value="name", required = false, defaultValue="Human") String name,
			@RequestParam(value="last_name", required = false, defaultValue="") String lastName) {
		return "Hello " + name + " " + lastName;
	}
	
	
	@RequestMapping("/name")
	public String nameTimes(@RequestParam(value="name") String name, @RequestParam(value="times") int number) {
		 String nameNum = "";
		 for(int i = 0; i < number; i++) {
			 nameNum = nameNum + "Hello " + name + " ";
		 }
		 return nameNum;
		 
		
	}
}
	
