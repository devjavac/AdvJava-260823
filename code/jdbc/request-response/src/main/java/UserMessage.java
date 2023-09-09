

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-msg")
public class UserMessage extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
			out.print("<h1>User Message</h1>");
			out.print("<form action='show-msg'>");
				out.print("Enter Name : <input type='text' name='name'>");
				out.print("<br><br>");
				out.print("Enter Message : <textarea name='msg' rows='3' cols='10'></textarea>");
				out.print("<br><br>");
				out.print("<button type='submit'>Send</button>");
			out.print("</form>");
		out.print("</div>");
	}
}
