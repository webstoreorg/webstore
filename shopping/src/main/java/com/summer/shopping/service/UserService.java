package com.summer.shopping.service;

import com.summer.shopping.entity.User;
import com.summer.shopping.exception.UserNotFoundException;

public interface UserService {
	
	//查询用户
	public User queryUser(int id) throws UserNotFoundException;
	
	//保存用户
	public boolean saveUser(User user) throws Exception;
	
	//验证用户登陆
	public boolean userLogin(User user);
	
	//获取用户id
	public int getUserId(User user);
	
	//用户注册
	public boolean userRegister(User user) throws Exception;
	
}
