import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava26aug","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM employee");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt("id") + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getDouble("salary"));
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
