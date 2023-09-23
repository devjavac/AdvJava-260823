<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home</title>
</head>
<body>
	<div align="right">
		<h3>User, <%= session.getAttribute("name") %> </h3>
		<h3>From, <%= session.getAttribute("city") %> </h3>
		<h3><a href="#">Sign-Out</a></h3>
	</div>
	<hr>
	<h1>Welcome To Home Page...</h1>
</body>
</html>