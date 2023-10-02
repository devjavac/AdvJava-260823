import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Main {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("hbm-config-oracle.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Student st = new Student();
		st.setName("Test1");
		st.setContact("9988112233");
		st.setGender('F');
		st.setDob(LocalDate.of(2003, 12, 13));
		st.setStatus(true);
		
		//session.save(st); // Save return the auto generated value back to java program.  
		session.persist(st); // persist method return void. wont get the generated value back.
		
		tr.commit();
		session.close();
		sf.close();
		
	}
}
