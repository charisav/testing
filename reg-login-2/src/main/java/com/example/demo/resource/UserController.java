package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.model.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new User());

		return "register";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user) {
		if (userRepository.findByUsername(user.getUsername()) == null) {
			userRepository.save(user);
		}
		return "redirect:/home";
	}
}
