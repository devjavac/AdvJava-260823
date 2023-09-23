<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-in</title>
</head>
<body>

<%
	String code = request.getParameter("c");
	String message="";
	String color = "";
	if(code != null) {
		switch(code) {
			case "401":
				message = "Invalid User Name or password...";
				color = "red";
				break;
			case "202":
				message = "You have been Logged out successfully..";
				color = "green";
				break;
		}
	}
%>
	<div align="center">
		<h1>User Sign-in Form</h1>
		<h3 style="color:<%=color%>"><%=message%></h3>
		<form action="auth-user">
			Enter Email: <input type="text" name="uname">
			<br><br>
			Enter Password: <input type="password" name="upass">
			<br><br>
			<button type="submit">Sing In</button>
			<br><br>
			<a href="#">Not Register Yet?</a>
			<br>
			<a href="#">Forgot Password?</a>
		</form>
	</div>
</body>
</html>