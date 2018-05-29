package com.school.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String sayHi() {
		
		System.out.println("inside Hi Controller");
		return "Hello World";
	}
}
