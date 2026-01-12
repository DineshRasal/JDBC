package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String uname=request.getParameter("username");
		String	p=(String) request.getAttribute("surname");
		pw.print("Hello "+uname+" "+p);
		
		

		HttpSession session=request.getSession(true);
		
		String	o=(String)session.getAttribute("dname");
		pw.print(o);
		

		ServletContext context=getServletContext();
		String s=(String) context.getAttribute("sname");
		
		pw.print(s);
	}

}
