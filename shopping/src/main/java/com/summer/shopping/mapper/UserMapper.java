package com.summer.shopping.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.summer.shopping.entity.User;

public interface UserMapper {
	
	@Select("SELECT id,name FROM user WHERE id=#{id}")
	User getUserById(int id);
	
	@Insert("INSERT INTO user (name) VALUES (#{name})")
	void insert(User user);
	
	@Delete("DELETE FROM user WHERE id = #{id}")
	void delete(int id);
}
