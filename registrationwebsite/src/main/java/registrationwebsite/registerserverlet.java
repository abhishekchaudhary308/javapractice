package registrationwebsite;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(
		urlPatterns = { "/register" }, 
		initParams = { 
				@WebInitParam(name = "driver", value = "com.mysql.cj.jdbc.Driver"), 
				@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/trangile"), 
				@WebInitParam(name = "username", value = "root"), 
				@WebInitParam(name = "password", value = "root")
		})
public class registerserverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// Read data 
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password= request.getParameter("password");
		String email = request.getParameter("email");
		
		
		// connect To Data Base
		PrintWriter out = response.getWriter();
		
		try
		{
			//Class.forName(getInitParameter("driver"));
			
			Connection con = db.DBConnection.getConn();
			PreparedStatement ps = con.prepareStatement("insert into User values(?,?,?,?)");
			
			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, name);
			ps.setString(3, password);
			ps.setString(4, email);
			
			
			
			
			int res = ps.executeUpdate();
			
			if(res >=1)
			{
			
				out.print("Registered sucessfully");
			}
			
		}catch (Exception e) {
			
			
			response.sendRedirect("error.html");
		}
		
		
	}

}
