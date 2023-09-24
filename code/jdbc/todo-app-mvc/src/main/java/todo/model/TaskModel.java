package todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

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
	
}
