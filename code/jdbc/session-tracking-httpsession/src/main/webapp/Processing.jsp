<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String fn = request.getParameter("fname");
	String ln = request.getParameter("lname");
	String gender = request.getParameter("gender");
	String prefix = gender.equalsIgnoreCase("m") ? "Mr. " : "Ms. " ;
	String name = String.join(" ", prefix, fn, ln);
	
	//HttpSession session = request.getSession(); // To Get the session
	session.setAttribute("username", name); // to add the data(Object) into session

	response.sendRedirect("Display.jsp");
%>

</body>
</html>





