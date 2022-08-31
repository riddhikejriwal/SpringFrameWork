package com.Conduira.springapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Conduira.springapplication.model.Greeting;

@RestController
public class HelloController {
	@Autowired
	private Greeting name;
	
	public void setEmployee(Greeting name) {
		this.name = name;
	}

	@GetMapping("/")
	public String name() {
		return name.getMyName();
	}
}
