package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
				//STEP 1:REGISTER DRIVER
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// STEP 2: CREATE CONNECTION
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","12345");
				
				// STEP 3: CREATE QUERY
				PreparedStatement pst=con.prepareStatement("select * from person");
				
				
				//STEP 4: EXECUTE QUERY
				ResultSet rs=pst.executeQuery();
				ResultSetMetaData rsmd=rs.getMetaData();
				System.out.println("Total number columns:"+rsmd.getColumnCount());
				System.out.println("Name Of First Column:"+rsmd.getColumnName(1));
				System.out.println("Type of First Column:"+rsmd.getColumnTypeName(1));

				
				//STEP 5: CLOSE CONNECTION
				con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
