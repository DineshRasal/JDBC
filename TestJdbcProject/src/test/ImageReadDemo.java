package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//STEP 1:REGISTER DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// STEP 2: CREATE CONNECTION
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","12345");
			
			// STEP 3: CREATE QUERY
			PreparedStatement pst=con.prepareStatement("select * from imgtable");
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				Blob b=rs.getBlob(2);
				  byte barr[] = b.getBytes(1, (int) b.length());
				
				FileOutputStream out=new FileOutputStream(new File("C:\\CodingQuestions\\Profile1.jpg") );
				
				out.write(barr);
				out.close();		
				}
			System.out.println("Image Read Successful");
		
			
			//STEP 4: EXECUTE QUERY
			//STEP 5: CLOSE CONNECTION
		
			
	}catch(Exception e) {
		System.out.println(e);
	}
	}
	}


