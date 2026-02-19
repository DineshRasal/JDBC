package com.config.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/config/annotations/spring.xml");
		
		Instructor instructor=(Instructor)context.getBean("instructor");
		System.out.println(instructor.hashCode());
		
		Instructor instructor1=(Instructor)context.getBean("instructor");
		System.out.println(instructor1.hashCode());
	}

}
