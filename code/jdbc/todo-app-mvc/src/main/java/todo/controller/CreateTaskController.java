package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.dto.TaskDto;
import todo.model.TaskModel;

@WebServlet("/add-my-task")
public class CreateTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Get Data
		String title = request.getParameter("title");
		String status = request.getParameter("status");
		String sdate = request.getParameter("schdate");
		// 2. Set Data into DTO
		TaskDto dto = new TaskDto();
		dto.setTitle(title);
		dto.setStatus(status);
		dto.setScheduledOn(sdate);
		//3. Create Object of model and call the method to save data
		TaskModel model = new TaskModel();
		int result = model.save(dto);
		String code = result>0 ? "201" : "500";
		//4. redirect to create task page
		response.sendRedirect("create-task.jsp?c="+code);
	}
}



