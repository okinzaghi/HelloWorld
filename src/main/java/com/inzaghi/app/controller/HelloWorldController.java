package com.inzaghi.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myHelloWorld")
public class HelloWorldController {
	@Value("${name}")
	private String str;
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello "+str+"!this is my first spring boot program";
	}
}
