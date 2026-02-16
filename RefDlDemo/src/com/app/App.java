package com.app;

import com.model.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Employee e=(Employee)context.getBean(employee1);
		e.display();
	}

}
