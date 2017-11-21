package com.example.demo;

public interface UserService {
	public void save(User user);
	public User findByUsername(String username);
}
