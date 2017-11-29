package com.ledao.api;

import com.ledao.api.model.User;

public interface DemoService {
 
	public String sayHello(String name);
 
    public User findUserById(long id);
}