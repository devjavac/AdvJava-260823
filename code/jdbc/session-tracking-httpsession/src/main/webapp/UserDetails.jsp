<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
	<div align="center">
	<h1>User Details</h1>
		<form action="Processing.jsp">
			Enter First Name : <input type="text" name="fname">
			<br><br>
			Enter Last Name : <input type="text" name="lname">
			<br><br>
			Select Gender : <input type="radio" name="gender" value="m">Male
							<input type="radio" name="gender" value="f">Female
			<br><br>
			<button type="submit">Send</button>
		</form>
	</div>
</body>
</html>