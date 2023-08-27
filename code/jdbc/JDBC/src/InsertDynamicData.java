import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData {
	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter ID: ");
			int id = scan.nextInt();
			System.out.println("Enter Name : ");
			String name = scan.next();
			System.out.println("Enter City : ");
			String city = scan.next();
			System.out.println("Enter Salary : ");
			double salary = scan.nextDouble();
			scan.close();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava26aug","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO employee VALUES(?, ?, ?, ?)"); // Parameterized Query
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, city);
				stmt.setDouble(4, salary);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " Rows Inserted....");		
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
