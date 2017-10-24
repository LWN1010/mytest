package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private Environment environment;
	
//	@Value("${name}")
//	private String name;
//	@Value("${url}")
//	private String url;
	
	// 入口url：http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello() {
		System.out.println("name:" + environment.getProperty("name"));
		System.out.println("url:" + environment.getProperty("url"));
		
//		System.out.println(name + "####" + url);
		return "notce.html";
	}
}
