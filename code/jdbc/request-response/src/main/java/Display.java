

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show-msg")
public class Display extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
			out.print("<h1>Welcome To Display Page</h1>");
			
			String nm = request.getParameter("name");
			String msg = request.getParameter("msg");
			
			out.print("<h3>Name : "+nm+" </h3>");
			out.print("<h3>Your Message : "+msg+" </h3>");
		out.print("</div>");
	}

}
