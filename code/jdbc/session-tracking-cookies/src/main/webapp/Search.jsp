<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Search</title>
</head>
<body>
<div align="center">
	<%
		// To get the cookies
		Cookie[] cookies = request.getCookies();
		String search = "";
		String visited = "";
		if(cookies!=null) {
			for(Cookie ck : cookies) {
				if(ck.getName().equals("search")) {
					search = ck.getValue();
				} 
				if(ck.getName().equals("visit")) {
					visited = ck.getValue();
				}
			}
		}
	%>
	<h2>Last Search : <%=search%></h2>
	<h2>Last Visited : <%=visited%> </h2>
 	<form action="get-result">
 		Query : <input type="text" name="q">
 		<br><br>
 		<button type="submit">Search</button>
 	</form>
</div>
</body>
</html>