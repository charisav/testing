package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
	@Autowired 
	private UserRepository userRepository;

	@Override
	public void save(User user) {
		user.setUsername(user.getUsername());
		user.setPassword(user.getPassword());
		userRepository.save(user);
	}

	 @Override
	 public User findByUsername(String username) {
		 return userRepository.findByUsername(username);
	 }
	
}
