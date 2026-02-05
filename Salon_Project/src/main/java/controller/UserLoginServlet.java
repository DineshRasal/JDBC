package controller;


import java.io.*;

import dao.UserDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

public class UserLoginServlet extends HttpServlet {

 protected void doPost(HttpServletRequest req,
 HttpServletResponse res) throws IOException,ServletException {

  String email=req.getParameter("email");
  String pass=req.getParameter("password");

  User u=UserDAO.login(email,pass);

  if(u!=null){

   HttpSession session=req.getSession();
   session.setAttribute("user",u);

   res.sendRedirect("dashboard.jsp");

  }else{
   res.sendRedirect("login.jsp?msg=invalid");
  }
 }
}
