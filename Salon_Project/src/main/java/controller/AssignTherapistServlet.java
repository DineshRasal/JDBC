package controller;


import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import dao.AppointmentDAO;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.EmailUtil;

public class AssignTherapistServlet extends HttpServlet{

 public void doPost(HttpServletRequest req,
 HttpServletResponse res)throws IOException{

  int id=Integer.parseInt(req.getParameter("aid"));
  String t=req.getParameter("therapist");

  AppointmentDAO.assign(id,t);

  EmailUtil.sendMail(
  req.getParameter("email"),
  "Appointment Confirmed with "+t);

  res.sendRedirect("admin-dashboard.jsp");
 }
}
