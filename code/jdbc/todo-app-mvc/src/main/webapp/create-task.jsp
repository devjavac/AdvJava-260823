<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Task</title>
</head>
<body>
<%
	String code = request.getParameter("c");
	String msg = "";
	String color = "";
	if(code != null) {
		switch(code) {
			case "201":
				msg = "Task Created Successfully..";
				color="green";
				break;
			case "500":
				msg = "Task Creation Failed.. Please try after sometime..";
				color="Red";
				break;
		}
	}
%>
	<%@ include file="menu.jsp" %>
	<div align="center">
		<h1>Create New task</h1>
		<h3 style="color: <%=color%>"><%=msg%></h3>
		<form action="add-my-task">
			Enter Title : <input type="text" name="title">
			<br><br>
			Select Status : <select name="status">
								<option value="Open">Open</option>
								<option value="InProgress">InProgress</option>
								<option value="Completed">Completed</option>
							</select>
			<br><br>
			Select Scheduled Date : <input type="date" name="schdate">
			<br><br>
			<button type="submit">Create Task</button>
		</form>
	</div>
</body>
</html>