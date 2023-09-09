

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate-user")
public class AuthUser extends HttpServlet {
	HashMap<String, String> users = new HashMap<String, String>();
	public AuthUser() {
		users.put("admin", "admin123");
		users.put("Abc", "abc123");
		users.put("Xyz", "xyz@123");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String password = request.getParameter("upass");
		String value = users.get(userName);
		if(value != null && value.equals(password)) {
			RequestDispatcher dis = request.getRequestDispatcher("user-home");
			dis.forward(request, response);
		} else {
			response.sendRedirect("error");
		}	
	}
}










