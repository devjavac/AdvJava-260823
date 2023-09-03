

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sing-in")
public class UserLogin extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
			out.print("<form>");
				out.print("<input type='text' placeholder='Enter Email Address' name='email'>");
				out.print("<br/><br/>");
				out.print("<input type='password' placeholder='Password' name='pass'>");
				out.print("<br/><br/>");
				out.print("<button style='background-color:blue;text-color:white;' type='submit'>Login in</button>");
				out.print("<br/><br/>");
				out.print("<a href='#'>Forgotten password?</a>");
			out.print("</form>");
		out.print("</div>");
	}

}
