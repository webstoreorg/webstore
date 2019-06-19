package com.summer.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.summer.shopping.entity.User;
import com.summer.shopping.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("user/{id}")
	public String getUserById(@PathVariable("id") int id) {
		return userService.queryUser(id).toString();
	}
	
	@GetMapping("greeting")
	public String hello() {
		return "Hello world";
	}
	
	@PostMapping("save")
	public void save(@RequestBody User user) {
		userService.saveUser(user);
	}
}
