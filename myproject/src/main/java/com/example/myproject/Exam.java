package com.example.myproject;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Exam {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/addon")
	String addon() {
		return "How are you today?";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Exam.class, args);
	}

}
