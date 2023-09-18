

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get-result")
public class Result extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query = request.getParameter("q");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>You search for : "+query+"</h1>");
		
		// To create Cookie
		Cookie ck1 = new Cookie("search", query); 
		Cookie ck2 = new Cookie("visit", LocalDateTime.now().toString());
		// To set the expire time for cookie in seconds
		ck1.setMaxAge(48*60*60); 
		ck2.setMaxAge(48*60*60);
		// To Send Cookie at client side
		response.addCookie(ck1);
		response.addCookie(ck2);
	}
}
 



