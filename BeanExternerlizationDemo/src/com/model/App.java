package com.model;

import org.springframework.context.ApplicationContext;

public class App {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationdbServer("spring.xml");
		MtDao dao=(MyDao)context.getBean("mydao");
		System.out.println(dao);
	}
}
