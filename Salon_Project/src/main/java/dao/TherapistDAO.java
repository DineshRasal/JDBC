package dao;

import util.DBConnection;
import java.sql.*;
import model.Therapist;
import java.util.*;

public class TherapistDAO{

 public static List<Therapist> getAll(){

  List<Therapist> list=new ArrayList<>();

  try{
   Connection con=DBConnection.getConnection();

   ResultSet rs=
   con.createStatement()
   .executeQuery("select * from therapists");

   while(rs.next()){

    Therapist t=new Therapist();

    t.setId(rs.getInt("id"));
    t.setName(rs.getString("name"));

    list.add(t);
   }

  }catch(Exception e){}

  return list;
 }
}
