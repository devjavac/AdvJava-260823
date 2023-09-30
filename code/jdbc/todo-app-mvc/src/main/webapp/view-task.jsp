<%@page import="todo.dto.TaskDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View My Task</title>
</head>
<body>
<%@ include file="menu.jsp" %>
	<div align="center">
		
		<table border="1">
			<thead>
				<tr>
					<th>Title</th>
					<th>Status</th>
					<th>Created Date</th>
					<th>Last Updated</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
			<%
				List<TaskDto> list = (List<TaskDto>) request.getAttribute("tasks");
				if(list != null || !list.isEmpty()) {
					for(TaskDto task : list) {
			%>
					<tr>
						<td><%= task.getTitle()%> </td>
						<td><%= task.getStatus()%></td>
						<td><%= task.getScheduledOn()%></td>
						<td><%= task.getUpdatedOn()%></td>
						<td><a href="#">Edit</a></td>
						<td><a href="#">Delete</a></td>
					</tr>
			
			<%			
					}
				}
			%>
			</tbody>
		</table>
		
		
	</div>
</body>
</html>