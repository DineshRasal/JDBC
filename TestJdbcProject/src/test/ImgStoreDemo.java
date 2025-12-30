package test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImgStoreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//STEP 1:REGISTER DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// STEP 2: CREATE CONNECTION
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","12345");
			
			// STEP 3: CREATE QUERY
			PreparedStatement pst=con.prepareStatement("insert into imgtable(name,profile_pic) values(?,?)");
			pst.setString(1,"Vivek");
			
			FileInputStream input=new FileInputStream(new File("C:\\CodingQuestions\\Profile1.jpg") );
			
			pst.setBinaryStream(2,input );
			//STEP 4: EXECUTE QUERY
			int rs=pst.executeUpdate();
			//STEP 5: CLOSE CONNECTION
			if(rs>0) {
				System.out.println("Data Inserted Successfully");
			}
			input.close();
			pst.close();
			con.close();
			
	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
