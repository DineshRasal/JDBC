package test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseMetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
				//STEP 1:REGISTER DRIVER
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// STEP 2: CREATE CONNECTION
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","12345");
				
				// STEP 3: CREATE QUERY
				DatabaseMetaData dbmd=con.getMetaData();
				
				System.out.println("Driver Name: "+dbmd.getDriverName());
				System.out.println("Driver Version: "+dbmd.getDriverVersion());
				System.out.println("DataBase Version: "+dbmd.getDatabaseMajorVersion());
				System.out.println("DataBase Name: "+dbmd.getDatabaseProductName());


				
				//STEP 4: EXECUTE QUERY
				
				
				//STEP 5: CLOSE CONNECTION
				con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
