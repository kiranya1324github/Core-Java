package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Student st=(Student) ctx.getBean("sob");
		
		
		System.out.println("First object="+st);
		
	}

}
