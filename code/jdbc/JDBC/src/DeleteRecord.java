import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter ID: ");
			int id = scan.nextInt();
			scan.close();

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava26aug", "root", "root");
			PreparedStatement stmt = con.prepareStatement("DELETE FROM employee WHERE id=?"); // Parameterized Query
				stmt.setInt(1, id);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " Rows Deleted....");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
