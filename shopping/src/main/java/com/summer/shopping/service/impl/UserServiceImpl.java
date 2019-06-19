package com.summer.shopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.summer.shopping.entity.User;
import com.summer.shopping.mapper.UserMapper;
import com.summer.shopping.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryUser(int id) {
		return userMapper.getUserById(id);
	}

	@Override
	public void saveUser(User user) {
		userMapper.insert(user);
	}
	
	
}
