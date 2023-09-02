import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectGroupByData {
	public static void main(String[] args) {
		try {
			Class.forName(DBPropertyUtil.getProperty("driver"));
			Connection con = DriverManager.getConnection(DBPropertyUtil.getProperty("url")
					,DBPropertyUtil.getProperty("user")
					,DBPropertyUtil.getProperty("password"));
			PreparedStatement stmt = con.prepareStatement("SELECT city, count(id) AS total FROM employee GROUP BY city");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("city") + "\t");
				System.out.print(rs.getInt("total") + "\n");
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
