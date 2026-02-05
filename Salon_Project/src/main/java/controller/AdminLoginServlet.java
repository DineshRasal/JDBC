package controller;


import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import dao.AdminDAO;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminLoginServlet extends HttpServlet{

 public void doPost(HttpServletRequest req,
 HttpServletResponse res)throws IOException{

  String e=req.getParameter("email");
  String p=req.getParameter("password");

  boolean b=AdminDAO.login(e,p);

  if(b){
   HttpSession s=req.getSession();
   s.setAttribute("admin",e);

   res.sendRedirect("admin-dashboard.jsp");
  }else{
   res.sendRedirect("admin-login.jsp?msg=invalid");
  }
 }
}
