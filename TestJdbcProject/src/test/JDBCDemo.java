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
			
			// STEP 3:  CREATE STATEMENT
				Statement stmt=con.createStatement();
				
			// STEP 4: EXECUTE QUERY
				ResultSet rs=stmt.executeQuery("Select * from person");
				
				while(rs.next()) {
					System.out.println("ID: "+rs.getInt(1)+" Name:"+rs.getString(2)+" Age:"+rs.getInt(3));
				}
			
			//STEP 5:  CLOSE CONNECTION
				con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
