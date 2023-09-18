<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Details</title>
</head>
<body>
<div align="center">
	<h1>Step 1 of 3</h1>
	<hr>
	<h3>Personal Details</h3>
	<%
		String status = request.getParameter("s");
		String color="";
		String message="";
		if(status != null) {
			if("P".equals(status)) {
				color = "green";
				message = "Data Save Successfully";
			} else {
				color = "red";
				message = "Fail to Save Data. Please try after sometime..";
			}
		}
	%>
	<h2 style="color: <%=color%>"> <%= message %> </h2>
	<form action="AddressDtls.jsp">
		Enter Name : <input type="text" name="name">
		<br><br>
		Enter Email : <input type="text" name="email">
		<br><br>
		Enter Contact : <input type="text" name="contact">
		<br><br>
		<button type="submit">Next</button>
	</form>
</div>
</body>
</html>