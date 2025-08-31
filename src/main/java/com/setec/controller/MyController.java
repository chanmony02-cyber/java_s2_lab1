package com.setec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping({"/","/home"})
	public String home() {
		return "index";
	}	
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}	
	
	@GetMapping("/service")
	public String service() {
		return "service";
	}
	
	@GetMapping("/reservation")
	public String reservation() {
		return "reservation";
	}
	
	@GetMapping("/testimonial")
	public String testimonial() {
		return "testimonial";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
}
