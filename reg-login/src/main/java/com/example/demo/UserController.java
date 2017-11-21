package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String registration(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		userService.save(user);
		return "redirect:/welcome";
	}
	
	@RequestMapping("/login")
	public String login(String username, String password) {
		User user = userService.findByUsername(username);
		if(user == null) {
			return "User does not exist.";
		}
		if(user.getPassword().equals(password)) {
			return "redirect:/welcome";
		}
		return "Incorrect password";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
}
