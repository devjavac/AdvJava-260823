import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyUtil {
	private static Properties properties = new Properties(); 
	static {
		try {
			properties.load(new FileInputStream("resources/db-config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key); 
	}
}
