import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.AddressDetails;
import com.entity.StudentDetails;

public class Main {
	public static void main(String[] args) {
		StudentDetails stud = new StudentDetails();
			stud.setName("A");
			stud.setEmail("a@gmail.com");
			stud.setContact("9988009988");
		AddressDetails add = new AddressDetails();
			add.setCity("Pune");
			add.setPincode("886655");
			add.setState("MH");
			add.setStudDetails(stud);
			
		Configuration cfg = new Configuration();
		cfg.configure("hbm-config-oracle.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
			session.save(stud);
			session.save(add);
		tr.commit();
		session.close();
		sf.close();	
	}
}
