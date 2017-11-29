package com.ledao.provider.service;

import org.springframework.stereotype.Service;

import com.ledao.api.DemoService;
import com.ledao.api.model.User;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		 return "Hello " + name;
	}

	public User findUserById(long id) {
		User user = new User();
		user.setId(id);
		user.setName("Ricky");
		user.setAge(26);
		
		return user;
	}
 
}