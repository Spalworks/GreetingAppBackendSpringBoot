package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GettingController {
	
	
	@GetMapping(value = {"","/","/home"})
	public String hello() {
		return "Hello I'm Sourav !!!";
	}
	
//	@GetMapping(value = "/")
	
}
