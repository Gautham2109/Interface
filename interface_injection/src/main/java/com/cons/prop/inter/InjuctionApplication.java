package com.cons.prop.inter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InjuctionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(InjuctionApplication.class, args);
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("demo.xml");
		
		College sdm = (College) contex.getBean("star");
		
		sdm.demo();
		
	
	}

}
