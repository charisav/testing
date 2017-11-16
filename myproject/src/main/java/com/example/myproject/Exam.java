package com.example.myproject;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Exam {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/")
	String home() {
		return "What's your name?";
	}
	
	@RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Exam.class, args);
	}

}
