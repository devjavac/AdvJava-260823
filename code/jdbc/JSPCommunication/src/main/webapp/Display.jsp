<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Details</title>
</head>
<body>
<%  
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
	// int num = Integer.parseInt(stringvalue)
%>

<div align="center">
	<h2>Name : <%= name %> </h2>
	<h2>Email : <%= email %></h2>
	<h2>Contact : <%= contact %> </h2>
</div>


</body>
</html>