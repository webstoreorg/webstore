package com.summer.shopping.service;

import com.summer.shopping.entity.User;

public interface UserService {
	
	public User queryUser(int id);
	
	public void saveUser(User user);
}
