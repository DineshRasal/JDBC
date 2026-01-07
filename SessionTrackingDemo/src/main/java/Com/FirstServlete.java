package Com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServlete
 */
@WebServlet("/FirstServlete")
public class FirstServlete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
			String n=request.getParameter("username");
			pw.print("Welcome"+n);
			
			Cookie ck=new Cookie("uname",n);
			response.addCookie(ck);
			pw.print("<form action='SecoundServlet' method='post'>");
			pw.print("<input type='submit' value='Visit'>");
			pw.print("</form>");
			pw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
