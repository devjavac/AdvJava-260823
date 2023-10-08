import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.AddressDetails;
import com.entity.StudentDetails;

public class Main3 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hbm-config-oracle.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		StudentDetails stud = session.get(StudentDetails.class, 1);
			System.out.println("Id : " + stud.getSid());
			System.out.println("Name : " + stud.getName());
			System.out.println("Email : " + stud.getEmail());
			System.out.println("Contact : " + stud.getContact());
			
			System.out.println("Id : " + stud.getAddDetails().getAid());
			System.out.println("City : " + stud.getAddDetails().getCity());
			System.out.println("State : " + stud.getAddDetails().getState());
			System.out.println("pincode : " + stud.getAddDetails().getPincode());
		
		System.out.println(stud.getEdus());
			
		/*AddressDetails add = session.get(AddressDetails.class, 1);
			System.out.println("Id : " + add.getAid());
			System.out.println("City : " + add.getCity());
			System.out.println("State : " + add.getState());
			System.out.println("pincode : " + add.getPincode());
			
			System.out.println("Stud Id : " + add.getStudDetails().getSid());
			System.out.println("Name : " + add.getStudDetails().getName());
			System.out.println("Email : " + add.getStudDetails().getEmail());
			System.out.println("Contact : " + add.getStudDetails().getContact());*/
		tr.commit();
		session.close();
		sf.close();	
	}
}










