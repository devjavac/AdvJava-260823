import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Student;
import com.cofig.DbSetup;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student stud = ctx.getBean(Student.class);
		stud.saveStudent();
	}
}
