package com.summer.shopping;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.summer.shopping.entity.User;
import com.summer.shopping.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShoppingApplicationTests {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	void contextLoads() {
		User user = new User();
        user.setName("irving2");
        userMapper.insert(user);
        System.out.println("success");
    	}
	}

