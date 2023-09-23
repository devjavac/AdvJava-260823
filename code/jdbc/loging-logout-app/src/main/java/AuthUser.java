

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/auth-user")
public class AuthUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Accepting User Credentials
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		boolean valid=false;
		
		//2. Authentication and Session creation
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava26aug","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM usersdetails WHERE email=? AND password=?");
			stmt.setString(1, name);
			stmt.setString(2, pass);
			ResultSet rs = stmt.executeQuery(); 
			if(rs.next()) {
				valid = true;
				HttpSession session = request.getSession();
				int id = rs.getInt("id");
				String username = rs.getString("name");
				String city = rs.getString("city");
				String email = rs.getString("email");
				session.setAttribute("id", id);
				session.setAttribute("name", username);
				session.setAttribute("email", email);
				session.setAttribute("city", city);
			} 
			con.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		// 3. Redirection
		if(valid) {
			response.sendRedirect("home.jsp");
		} else {
			response.sendRedirect("login.jsp?c=401");
		}
	}
}
