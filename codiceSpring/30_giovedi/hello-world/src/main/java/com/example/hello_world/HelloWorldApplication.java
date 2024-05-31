package com.example.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//questa non sarà più una classe normale, ma un bean
@SpringBootApplication
@RestController
public class HelloWorldApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
			@RequestParam(value = "name1", defaultValue = "User") String name1) {
		return String.format("Hello %s and %s!", name, name1);
	}
}