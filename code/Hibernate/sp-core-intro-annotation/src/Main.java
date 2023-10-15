import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
								  // ClassPathXmlApplicationContext("XML_FIle")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
	}

}
