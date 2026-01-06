package Test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Information
 */
@WebServlet("/Information")
public class Information extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Information() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		 String username = request.getParameter("username");
	        String email = request.getParameter("email");
	        String age = request.getParameter("Age");
	        String gender = request.getParameter("Gender");
	        String dob = request.getParameter("DOB");
	        String Skills=request.getParameter("skills");
	        String address = request.getParameter("address");
	        String qualification = request.getParameter("qualification");
	        String college = request.getParameter("College");
	        String university = request.getParameter("University");
	        String passingYear = request.getParameter("PassingYear");
	       

	        pw.println("<h2>User Information</h2>");
	        pw.println("Username: " + username + "<br>");
	        pw.println("Email: " + email + "<br>");
	        pw.println("Age: " + age + "<br>");
	        pw.println("Gender: " + gender + "<br>");
	        pw.println("DOB: " + dob + "<br>");
	        pw.println("Skills: "+Skills+"<br>");
	        pw.println("<br><br>");
	        pw.println("Address: " + address + "<br>");
	        pw.println("Qualification: " + qualification + "<br>");
	        pw.println("College: " + college + "<br>");
	        pw.println("University: " + university + "<br>");
	        pw.println("Passing Year: " + passingYear + "<br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
