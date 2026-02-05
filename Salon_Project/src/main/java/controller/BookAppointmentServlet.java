package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

import model.Appointment;
import model.User;
import dao.AppointmentDAO;

public class BookAppointmentServlet extends HttpServlet{

 protected void doPost(HttpServletRequest req,
 HttpServletResponse res)throws IOException,ServletException{

  HttpSession s=req.getSession();

  User u=(User)s.getAttribute("user");

  Appointment a=new Appointment();

  a.setUserId(u.getId());
  a.setService(req.getParameter("service"));
  a.setDate(req.getParameter("date"));
  a.setTime(req.getParameter("time"));

  AppointmentDAO.book(a);

  res.sendRedirect("appointment-history.jsp");
 }
}
