package dao;

import util.DBConnection;
import java.sql.*;
import java.util.*;
import model.Appointment;

public class AppointmentDAO {

 // ================= BOOK =================
 public static int book(Appointment a){

  int i=0;

  try{
   Connection con=DBConnection.getConnection();

   PreparedStatement ps=
   con.prepareStatement(
"insert into appointments(user_id,service,date,time,status) values(?,?,?,?,?)");

   ps.setInt(1,a.getUserId());
   ps.setString(2,a.getService());
   ps.setString(3,a.getDate());
   ps.setString(4,a.getTime());
   ps.setString(5,"PENDING");

   i=ps.executeUpdate();

   con.close();

  }catch(Exception e){
   e.printStackTrace();
  }

  return i;
 }

 // ============== USER HISTORY ===============
 public static List<Appointment> getByUser(int uid){

  List<Appointment> list=new ArrayList<>();

  try{
   Connection con=DBConnection.getConnection();

   PreparedStatement ps=
   con.prepareStatement(
   "select * from appointments where user_id=?");

   ps.setInt(1,uid);

   ResultSet rs=ps.executeQuery();

   while(rs.next()){

    Appointment a=new Appointment();

    a.setId(rs.getInt("id"));
    a.setService(rs.getString("service"));
    a.setDate(rs.getString("date"));
    a.setTime(rs.getString("time"));
    a.setStatus(rs.getString("status"));

    // IF COLUMN EXIST
    try{
     a.setTherapist(rs.getString("therapist"));
    }catch(Exception ex){}

    list.add(a);
   }

   con.close();

  }catch(Exception e){
   e.printStackTrace();
  }

  return list;
 }

 // ============= ADMIN VIEW ALL =============
 public static List<Appointment> getAll(){

  List<Appointment> list=new ArrayList<>();

  try{
   Connection con=DBConnection.getConnection();

   ResultSet rs=
   con.createStatement()
   .executeQuery("select * from appointments");

   while(rs.next()){

    Appointment a=new Appointment();

    a.setId(rs.getInt("id"));
    a.setUserId(rs.getInt("user_id"));
    a.setService(rs.getString("service"));
    a.setDate(rs.getString("date"));
    a.setStatus(rs.getString("status"));

    try{
     a.setTherapist(rs.getString("therapist"));
    }catch(Exception ex){}

    list.add(a);
   }

   con.close();

  }catch(Exception e){
   e.printStackTrace();
  }

  return list;
 }

 // ============= ASSIGN THERAPIST =============
 public static void assign(int id,String therapist){

  try{
   Connection con=DBConnection.getConnection();

   PreparedStatement ps=
   con.prepareStatement(
   "update appointments set therapist=?, status='CONFIRMED' where id=?");

   ps.setString(1,therapist);
   ps.setInt(2,id);

   ps.executeUpdate();

   con.close();

  }catch(Exception e){
   e.printStackTrace();
  }
 }

 // ============= GET USER EMAIL FOR MAIL =============
 public static String getUserEmail(int aid){

  String email="";

  try{
   Connection con=DBConnection.getConnection();

   PreparedStatement ps=
   con.prepareStatement(
"select u.email from users u, appointments a where u.id=a.user_id and a.id=?");

   ps.setInt(1,aid);

   ResultSet rs=ps.executeQuery();

   if(rs.next()){
    email=rs.getString(1);
   }

   con.close();

  }catch(Exception e){
   e.printStackTrace();
  }

  return email;
 }

 // ============= PENDING LIST (OPTIONAL) =============
 public static List<Appointment> getPending(){

  List<Appointment> list=new ArrayList<>();

  try{
   Connection con=DBConnection.getConnection();

   ResultSet rs=
   con.createStatement()
   .executeQuery("select * from appointments where status='PENDING'");

   while(rs.next()){

    Appointment a=new Appointment();

    a.setId(rs.getInt("id"));
    a.setService(rs.getString("service"));
    a.setDate(rs.getString("date"));

    list.add(a);
   }

   con.close();

  }catch(Exception e){}

  return list;
 }

}
