package com.rushi.rasal.SpringJDBCTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/rushi/rasal/SpringJDBCTest/spring.xml");
    	JdbcTemplate jdbcTemplate=(JdbcTemplate)context.getBean("jdbcTemplate");
    	String sql="insert into employeee values(?,?,?)";
    	int result =jdbcTemplate.update(sql,1,"Navin", "Patil");
    	System.out.println("Number of records inserted are:"+ result);
    
    }
}
