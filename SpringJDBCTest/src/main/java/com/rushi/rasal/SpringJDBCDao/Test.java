package com.rushi.rasal.SpringJDBCDao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/rushi/rasal/SpringJDBCDao/spring.xml");
		StudentDao dao=(StudentDao) context.getBean("studentdao");
		//Inserting Data
		dao.save(new Student("Rushi","rushi@example.com"));
		//Displaying data
		List<Student> students=dao.findAll();
		for(Student s:students) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getEmail());
			
		}
		
		dao.delete(2);
	}

}
