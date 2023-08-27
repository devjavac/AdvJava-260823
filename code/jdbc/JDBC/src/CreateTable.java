import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava26aug","root","root");
			// 3. Create Statement
			PreparedStatement stmt = con.prepareStatement("CREATE TABLE employee(id int, name varchar(20), city varchar(20), salary double)");
			// 4. Execute Statement
			int count = stmt.executeUpdate();
			// 5. Close Connection
			con.close();
			System.out.println(count + " Rows Effected....");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
