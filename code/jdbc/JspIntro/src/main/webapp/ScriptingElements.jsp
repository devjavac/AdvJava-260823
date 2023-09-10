<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Scripting Element Demo</h1>
	
	<%! 
		int x = 10; 
		static int z = 20;
		public void test() {
			System.out.println("This is custom method inside JSP...");
		}
	%>
	
	<%
		int a = 20;
		int b = 30;
		System.out.println(a * b);
	%>
	<%= a * b %>
	
	<%
		for(int i = 1 ; i<=10; i++) {
	%>
			<br/>
			<%= i %>	
	<%		
		}
	%>
	


</body>
</html>






