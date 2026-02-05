package controller;


import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.EmailUtil;

public class AdminAssignServlet extends HttpServlet{

 public void doPost(HttpServletRequest req,
 HttpServletResponse res)throws IOException{

  String email=req.getParameter("email");
  String therapist=req.getParameter("therapist");

  String msg="Your appointment confirmed with therapist: "
  +therapist;

  EmailUtil.sendMail(email,msg);

  res.sendRedirect("viewAppointments.jsp");
 }
}
