package com.example.jenkinsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsExampleApplication {

	@GetMapping("/hello")
	public String hello(){
		return "Hello from Spring boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsExampleApplication.class, args);
	}

}
