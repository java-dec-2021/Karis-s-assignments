package com.karis.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/process")
	public String submit(@RequestParam("name") String name, @RequestParam("location") String location, 
			@RequestParam("language") String language, @RequestParam("comment") String comment, Model model) {
			model.addAttribute("name", name);
			model.addAttribute("location", location);
			model.addAttribute("language", language);
			model.addAttribute("comment",comment);
		
		return "result.jsp";
	}
	
	
}
