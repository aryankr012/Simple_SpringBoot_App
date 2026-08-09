package com.ashokIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokIT.service.WebService;

@RestController
public class webController {
	
	@Autowired
	private WebService webService;
	
	@GetMapping("/")
	public String welcome() 
	{
		
		return webService.welcome();
	}
	
}
