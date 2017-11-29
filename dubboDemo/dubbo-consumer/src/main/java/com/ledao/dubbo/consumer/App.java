package com.ledao.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ledao.api.DemoService;
import com.ledao.api.model.User;

/**
 * Dubbo Consumer client
 *
 */
public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				 "classpath:applicationContext.xml");
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService"); 
		String hello = demoService.sayHello("ricky"); 
		System.out.println(hello); 
		
		User user = demoService.findUserById(15);
		System.out.println(user); 
		
	}
}
