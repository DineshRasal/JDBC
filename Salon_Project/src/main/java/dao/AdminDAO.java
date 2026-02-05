package dao;

import util.DBConnection;
import java.sql.*;

public class AdminDAO {

 public static boolean login(String e,String p){

  boolean b=false;

  try{
   Connection con=DBConnection.getConnection();

   PreparedStatement ps=
   con.prepareStatement(
   "select * from admin where email=? and password=?");

   ps.setString(1,e);
   ps.setString(2,p);

   ResultSet rs=ps.executeQuery();

   b=rs.next();

  }catch(Exception ex){}

  return b;
 }

}
