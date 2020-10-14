package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	@RequestMapping("/")
	String hello() {
		return "hello!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Spring Boot!!");
	}

}
