import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hbm-config.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee(); // Transient Object state
		emp.setId(12);
		emp.setName("Abc");
		emp.setEmail("abc@gmail.com");
		emp.setContact("99988776655");
		emp.setCity("Pune");
		
		session.save(emp); // Persistent Object state
		
		tr.commit();
		session.close();
		sf.close();
	}
}



