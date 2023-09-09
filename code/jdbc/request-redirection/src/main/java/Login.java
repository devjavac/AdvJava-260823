

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-login")
public class Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
			out.print("<h1>User Login Form</h1>");
			out.print("<form action='validate-user'>");
				out.print("Enter User Name : <input type='text' name='uname'>");
				out.print("<br><br>");
				out.print("Enter Password: <input type='password' name='upass'>");
				out.print("<br><br>");
				out.print("<button type='submit'>Sign In</button>");
			out.print("</form>");
		out.print("</div>");
	}
}





