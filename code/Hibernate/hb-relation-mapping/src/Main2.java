import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.EducationDetails;
import com.entity.StudentDetails;

public class Main2 {
	public static void main(String[] args) {
		StudentDetails stud = new StudentDetails();
			stud.setSid(1);
		EducationDetails edu1 = new EducationDetails();
			edu1.setTitle("10th");
			edu1.setPassyear(2000);
			edu1.setPercent(88.99);
			edu1.setStudDetails(stud);
		EducationDetails edu2 = new EducationDetails();
			edu2.setTitle("12th");
			edu2.setPassyear(2002);
			edu2.setPercent(81.91);
			edu2.setStudDetails(stud);
		EducationDetails edu3 = new EducationDetails();
			edu3.setTitle("BE");
			edu3.setPassyear(2006);
			edu3.setPercent(80.90);
			edu3.setStudDetails(stud);
		Configuration cfg = new Configuration();
		cfg.configure("hbm-config-oracle.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
			session.save(edu1);
			session.save(edu2);
			session.save(edu3);
		tr.commit();
		session.close();
		sf.close();	
	}
}
