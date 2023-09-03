import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class FirstServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // char response
		//OutputStream out = response.getOutputStream(); // Binary Response
		
		System.out.println("Hello Welcome To First Servlet");
		
		out.print("Hello This is my First Text Response");
		out.print("<h1>Hello This is my First HTML reponse</h1>");
	}
}
