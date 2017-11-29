package com.ledao.provider.service;

import org.springframework.stereotype.Service;

import com.ledao.api.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	public String sayHi(String msg) {
		return "Hello "+msg;
	}


}
