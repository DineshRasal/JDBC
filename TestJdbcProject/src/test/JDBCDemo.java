package test;

import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//STEP 1: 	REGISTER DRIVER
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			//STEP 2:   CREATE CONNECTION
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","12345");
				
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
