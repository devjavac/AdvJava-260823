<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<%
		String name = (String) session.getAttribute("username");
	%>

	<h1>Hello, <%=name%> </h1>

</div>
</body>
</html>