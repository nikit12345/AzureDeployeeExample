package com.example.AzureDeployeeExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HomeController {
	
	@GetMapping("/get")
	public String hii() {
		return "Welcome to azure";
	}

}
