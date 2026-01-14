package test;
import java.util.*;
import java.sql.*;

public class EmpDao {

	public static Connection getConnection() {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudtestdb","root","12345");

			
		}catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
		return con;
	}
	
	public static int  save(Emp e) {
		int status=0;
		
		try {
			
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into usertable(id,name,password,email,country) values(?,?,?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2,e.getName());
			ps.setString(3,e.getPassword());
			ps.setString(4, e.getEmail());
			ps.setString(5, e.getCountry());
			
			status=ps.executeUpdate();
			con.close();
		}catch (Exception e1) {
			
			System.out.println(e1);
		}
		return status;
	}
	
	public static List<Emp>getAllEmployees(){
		List<Emp> list=new ArrayList<Emp>();
		
		

		
		try {
			
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select *from usertable");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				Emp e=new Emp();
				e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setPassword(rs.getString(3));
			e.setEmail(rs.getString(4));
			e.setCountry(rs.getString(5));
			
			list.add(e);
			}
			
			con.close();
		
			
		}catch (Exception e2) {
			System.out.println(e2);
		}
		return list;
	}
}
