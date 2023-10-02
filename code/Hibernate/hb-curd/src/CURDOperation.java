import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/*
 * Insert Data into table 
 * 		save(entity_object)
 * 		persist(entity_object)
 * Update the data into table
 * 		update(entity_object)
 * 		saveOrUpdate(entity_object)
 * Delete the data from table
 * 		delete(entity_object)
 * Select the data from table
 * 		get(EntityClassname, Primary_Key_Value)
 *  	load(EntityClassname, Primary_Key_Value)
 */

public class CURDOperation {
	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("hbm-config-oracle.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
			Student stud = new Student();
			stud.setId(3);
			stud.setContact("");
			stud.setName("");
			
			//session.update(stud); // To update the record
			//session.saveOrUpdate(stud);
			
			//session.delete(stud);
			
			Student st = session.get(Student.class, 4); // EAGER Fetch Type. It will return the actual object. It will get the data from the table always.
			//Student st = session.load(Student.class, 4); // LAZY Fetch Type.It will return the proxy object. It will get the data only if user tries to  use it
			System.out.println("Id : " + st.getId());
			System.out.println("Name : " + st.getName());
			System.out.println("Gender : " + st.getGender());
			System.out.println("Contact : " + st.getContact());
			System.out.println("Status : " + st.isStatus());
			System.out.println("DOB : " + st.getDob());
		tr.commit();
		session.close();
		sf.close();
		
		
	}
}













