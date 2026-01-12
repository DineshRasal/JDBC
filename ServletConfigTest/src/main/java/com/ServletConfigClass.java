package com;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletConfigClass
 */
//@WebServlet("/ServletConfigClass")
public class ServletConfigClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		ServletConfig config=getServletConfig();
		String n=config.getInitParameter("name");
		String s=config.getInitParameter("sirname");
		
		pw.println("Your init parameter of Config is "+n+" "+s);
		
		ServletContext contex=getServletContext();
		String p=contex.getInitParameter("Project");
		
		pw.println("Your init parameter Of context is "+p);
		pw.close();
	}

	
}
