package util;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailUtil {

 public static void sendMail(String to,String msg){

  final String from="yourmail@gmail.com";
  final String pass="app-password";

  Properties p=new Properties();

  p.put("mail.smtp.host","smtp.gmail.com");
  p.put("mail.smtp.port","587");
  p.put("mail.smtp.auth","true");
  p.put("mail.smtp.starttls.enable","true");

  Session s=Session.getInstance(p,
  new Authenticator(){
   protected PasswordAuthentication getPasswordAuthentication(){
    return new PasswordAuthentication(from,pass);
   }
  });

  try{
   Message m=new MimeMessage(s);

   m.setFrom(new InternetAddress(from));
   m.setRecipients(Message.RecipientType.TO,
   InternetAddress.parse(to));

   m.setSubject("Salon Confirmation");
   m.setText(msg);

   Transport.send(m);

  }catch(Exception e){ e.printStackTrace(); }
 }
}
