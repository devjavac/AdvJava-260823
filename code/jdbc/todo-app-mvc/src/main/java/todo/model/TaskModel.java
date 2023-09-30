package todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import todo.dto.TaskDto;

public class TaskModel {
	private final String driver = "com.mysql.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/advjava26aug";
	private final String username = "root";
	private final String password = "root";
	
	public final Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}
	
	public int save(TaskDto dto) {
		int count = 0;
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement("INSERT INTO task VALUES(0,?,?,?,?)");
			stmt.setString(1, dto.getTitle());
			stmt.setString(2, dto.getStatus());
			stmt.setString(3, dto.getScheduledOn());
			stmt.setString(4, LocalDateTime.now().toString());
			count = stmt.executeUpdate();
			con.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return count;
	}
	
	public List<TaskDto> getAll() {
		ArrayList<TaskDto> tasks = new ArrayList<TaskDto>();
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement("select * from task order by scheduledOn desc");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				TaskDto task = new TaskDto();
				task.setId(rs.getInt("id"));
				task.setTitle(rs.getString("title"));
				task.setStatus(rs.getString("status"));
				task.setScheduledOn(rs.getString("scheduledOn"));
				task.setUpdatedOn(rs.getString("updatedOn"));
				tasks.add(task);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tasks;
	}
	
	
	
	
	
	
}
