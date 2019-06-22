package com.summer.shopping.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.summer.shopping.entity.User;

public interface UserMapper {
	
	@Select("SELECT id,name FROM user WHERE id=#{id}")
	Optional<User> getUserById(int id);
	
	@Insert("INSERT INTO user (name,phone,email,password) VALUES (#{name},#{phone},#{email},#{password})")
	void insert(User user);
	
	@Select("SELECT id FROM user WHERE name=#{name}")
	Optional<User> getUserByName(String name);
	
}
