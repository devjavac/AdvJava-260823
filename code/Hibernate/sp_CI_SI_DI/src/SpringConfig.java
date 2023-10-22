import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.cofig.DbSetup;

@Configuration
@ComponentScan(basePackages = {"com"})
public class SpringConfig {

	@Bean("mysqlSetup") // Is use to handover the object to the spring so than it will maintain inside spring container
	@Primary // to mark this as an default for DI
	public DbSetup mySqlSetup() {
		DbSetup db = new DbSetup();
		db.setDriver("MySql_Driver"); // Setter Injection (SI)
		db.setUrl("MySql_URL");
		db.setUserName("Mysql_User");
		db.setPassword("MySql_pass");
		return db;
	}
	
	@Bean("oracleSetup") // Is use to handover the object to the spring so than it will maintain inside spring container
	public DbSetup oracleSetup() {
		DbSetup db = new DbSetup("Oracle_Driver", "Oracle_URL", "Oracle_User", "Oracle_pass"); // Constructor Injection (CI) 
		return db;
	}
	
}
