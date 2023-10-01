package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.model.TaskModel;


@WebServlet("/delete-my-task")
public class DeleteTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int taskId = Integer.parseInt(request.getParameter("id"));
		TaskModel model = new TaskModel();
		boolean result = model.deleteById(taskId);
		response.sendRedirect("get-my-task");	
	}
}
