package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
				//STEP 1:REGISTER DRIVER
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// STEP 2: CREATE CONNECTION
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","12345");
				
				// STEP 3: CREATE QUERY
				PreparedStatement pst=con.prepareStatement("insert into person values(?,?,?)");
				pst.setInt(1,104);
				pst.setString(2,"Vivek");
				pst.setInt(3,23);
				
				//STEP 4: EXECUTE QUERY
				int i=pst.executeUpdate();
				System.out.println(i+"Record inserted");
				
				//STEP 5: CLOSE CONNECTION
				con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
