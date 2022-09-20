package registrationwebsite;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/employee-home")
public class EmployeeHomeServlet extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter out = resp.getWriter();
		HttpSession session=req.getSession();
		
		String email =(String) session.getAttribute("email");
		
		out.println("<html><head><title>Employee Home Page </title></head>");
		
		out.println("<body><div> Welcome "+" Email "+email);
		
		out.println("</div><div>");
		out.println("</div></body></html>");
		
	}

}

