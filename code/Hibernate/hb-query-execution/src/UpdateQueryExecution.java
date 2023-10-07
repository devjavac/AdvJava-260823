import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateQueryExecution {
	public static void main(String[] args) {
		// HQL : UPDATE ExpenseEntity SET price=? WHERE id=?
		Configuration cfg = new  Configuration();
		cfg.configure("hbm-config-oracle.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();	
		Query query = session.createQuery("UPDATE ExpenseEntity SET price=?1 WHERE id=?2");
		query.setDouble(1, 3000);
		query.setInteger(2, 1);
		int count = query.executeUpdate();
		System.out.println(count + " : rows updated..");
		tr.commit();
		session.close();
		sf.close();
	}
}
