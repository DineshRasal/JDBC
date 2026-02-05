package util;

public class EmailTemplate{

 public static String confirm(String t){

 return
 "Dear Customer,\n\n"+
 "Your appointment CONFIRMED\n"+
 "Therapist: "+t+"\n\n"+
 "Thank you";
 }

}
