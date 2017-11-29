package com.ledao.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dubbo provider
 *
 */
public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
		context.start();
		
		System.out.println("Dubbo provider start...");
		
		try {
			System.in.read();	
		} catch (IOException e) {
			e.printStackTrace();
		} 
		context.close();

	}
}
