package com.karis.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("/dojo")
	public String showName() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/dojo/{city}")
	public String showCity(@PathVariable("city") String cityName) {
		return cityName + " Dojo is located in Southern California";
	}

}
