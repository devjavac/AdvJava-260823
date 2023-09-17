

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-data")
public class SaveUserDtls extends HttpServlet {
	/*
	create sequence stud_seq;
	
	create table student(id int primary key,name varchar(20), 
	email varchar(50), contact varchar(10),city varchar(20), pincode varchar(6), 
	state varchar(20));
	*/
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		String pin = request.getParameter("pincode");
		String state = request.getParameter("state");
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava26aug","root","root");
			PreparedStatement stmt = 
					con.prepareStatement("INSERT INTO student VALUES(0,?, ?, ?, ?, ?, ?)"); // Parameterized Query
				stmt.setString(1, name);
				stmt.setString(2, email);
				stmt.setString(3, contact);
				stmt.setString(4, city);
				stmt.setString(5, pin);
				stmt.setString(6, state);
			count = stmt.executeUpdate();
			con.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		String status= count>0 ? "P" : "F";
		response.sendRedirect("PersonalDtls.jsp?s="+status);
	}
}
