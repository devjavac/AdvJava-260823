<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate User Bill</title>
</head>
<body>
	<div align="center">
		<h1>Generate User Electricity Bill</h1>
		<form action="generate-bill">
			Enter User Name : <input type="text" name="username">
			<br><br>			
			Enter City : <input type="text" name="city">
			<br><br>
			Enter unit Consume : <input type="text" name="unit">
			<br><br>
			Enter Due Date : <input type="date" name="duedate">
			<br><br>
			<button type="submit">Generate Bill</button>
		</form>
	</div>
	
</body>
</html>