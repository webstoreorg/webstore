package com.summer.shopping.entity;

import java.io.Serializable;
import java.sql.Date;

import com.summer.shopping.util.UserSexEnum;

public class User implements Serializable{
	

	private static final long serialVersionUID = 3301152882651495553L;

	private int user_id;
	
	private String name;
	
	private String password;
	
	private UserSexEnum sex;
	
	private String phone;
	
	private String email;
	
	private Date birthday;
	
	private String picture;
	
	


	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserSexEnum getSex() {
		return sex;
	}

	public void setSex(UserSexEnum sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getId() {
		return user_id;
	}

	public void setId(int id) {
		this.user_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "user{"+"id:"+user_id+",name:"+name+"}";
	}
}
