package controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import model.User;
import dao.UserDAO;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

 public void doPost(HttpServletRequest req,
 HttpServletResponse res)throws IOException{

  User u=new User();

  u.setName(req.getParameter("name"));
  u.setEmail(req.getParameter("email"));
  u.setPassword(req.getParameter("password"));
  u.setPhone(req.getParameter("phone"));

  UserDAO.register(u);

  res.sendRedirect("login.jsp?msg=registered");
 }
}
