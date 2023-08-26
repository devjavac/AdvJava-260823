import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static void main(String[] args) {
		try {
			// ========MySql=========
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection mysqlcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava26aug","root","root");
			System.out.println("Mysql Connection Successful....");
			
			// ========Oracle=========
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection oraclecon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			System.out.println("Oracle Connection Successful....");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
