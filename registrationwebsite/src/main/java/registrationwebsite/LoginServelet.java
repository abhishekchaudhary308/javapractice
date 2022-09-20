package registrationwebsite;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
//initParams = { 
//		@WebInitParam(name = "driver", value = "com.mysql.cj.jdbc.Driver"), 
//		@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/trangile"), 
//		@WebInitParam(name = "username", value = "root"), 
//		@WebInitParam(name = "password", value = "Tspl@1212")
//})
public class LoginServelet  extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String email = req.getParameter("email");
		
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		try
		{
//Class.forName(getInitParameter("driver"));
			
            Connection con = db.DBConnection.getConn();
			PreparedStatement ps = con.prepareStatement("select * from User where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				out.println("success");
			
				HttpSession session = req.getSession();
				
				session.setAttribute("email", rs.getString(4));
				
				RequestDispatcher rd = req.getRequestDispatcher("employee-home");
				
				rd.forward(req, resp);
			}
			else
			{
				out.println("Invalid Username or password");
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
			
			rd.include(req, resp);
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}

}

