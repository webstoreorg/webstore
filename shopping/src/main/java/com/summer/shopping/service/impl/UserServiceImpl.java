package com.summer.shopping.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.summer.shopping.entity.User;
import com.summer.shopping.exception.UserNotFoundException;
import com.summer.shopping.mapper.UserMapper;
import com.summer.shopping.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryUser(int id) throws UserNotFoundException{
		Optional<User> optional = this.userMapper.getUserById(id);
		if(!optional.isPresent()) {
			throw new UserNotFoundException();
		}
		return optional.get();
	}

	@Override
	public boolean saveUser(User user) throws Exception{
		try {
			this.userMapper.insert(user);
			return true;
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
	}

	@Override
	public boolean userLogin(User user) {
		return true;
	}

	@Override
	public int getUserId(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean userRegister(User user) throws Exception {
		try {
			if(this.userMapper.getUserByName(user.getName()) == null) {
				this.userMapper.insert(user);
				return true;
			}else {
				return false;
			}
			
		}catch (Exception e) {
			return false;
		}
	}


	
	
	
	
}
