package dao;

import util.DBConnection;
import java.sql.*;
import model.User;

public class UserDAO {

 public static int register(User u){
  int i=0;

  try{
   Connection con=DBConnection.getConnection();

   PreparedStatement ps=
   con.prepareStatement(
   "insert into users(name,email,password,phone) values(?,?,?,?)");

   ps.setString(1,u.getName());
   ps.setString(2,u.getEmail());
   ps.setString(3,u.getPassword());
   ps.setString(4,u.getPhone());

   i=ps.executeUpdate();

  }catch(Exception e){}

  return i;
 }

 public static User login(String e,String p){

  User u=null;

  try{
   Connection con=DBConnection.getConnection();

   PreparedStatement ps=
   con.prepareStatement(
   "select * from users where email=? and password=?");

   ps.setString(1,e);
   ps.setString(2,p);

   ResultSet rs=ps.executeQuery();

   if(rs.next()){
    u=new User();
    u.setId(rs.getInt("id"));
    u.setName(rs.getString("name"));
    u.setEmail(rs.getString("email"));
   }

  }catch(Exception ex){}

  return u;
 }
}
