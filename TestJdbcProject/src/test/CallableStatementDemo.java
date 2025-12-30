package test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CallableStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
				//STEP 1:REGISTER DRIVER
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// STEP 2: CREATE CONNECTION
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","12345");
				
				// STEP 3: CREATE QUERY
				CallableStatement stmt=con.prepareCall("{call delete_from_person(?)}");
				stmt.setInt(1,104);
				
				//STEP 4: EXECUTE QUERY
			
				stmt.execute();
				System.out.println("Deletion Successful");
				//STEP 5: CLOSE CONNECTION
				con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
