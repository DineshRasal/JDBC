package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BtachProcessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//STEP 1: 	REGISTER DRIVER
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			//STEP 2:   CREATE CONNECTION
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","12345");
			
				con.setAutoCommit(false);
			// STEP 3:  CREATE STATEMENT
				Statement stmt=con.createStatement();
				
			// STEP 4: EXECUTE QUERY
				stmt.addBatch("insert into person(id,name,age)values(106,'Sam',74)");
				stmt.addBatch("insert into person(id,name,age)values(107,'Ram',75)");
				
			
			//STEP 5: Execute Query
				stmt.executeBatch();
				
				con.commit();
				// STEP 6: CLOSE CONNECTION
				System.out.println("Sucess");
				con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
