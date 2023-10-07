import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*
 * session.createNativeQuery("") 	: is use for a SQL type of queries
 * session.createQuery("")			: is use for HQL type of queries
 * 
 * list()				: for SELECT query
 * executeUpdate()		: for all DML type of queries
 */

public class QueryExecution {
	public static void main(String[] args) {
		//SQL : select * from expense where amount>=500
		//HQL : from ExpenseEntity where price>=500
		Configuration cfg = new  Configuration();
		cfg.configure("hbm-config-oracle.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		// For SQL
		//Query<ExpenseEntity> query = 
		//		session.createNativeQuery("select * from expense where amount>=70", ExpenseEntity.class);
		
		// For HQL
		//Query<ExpenseEntity> query = session.createQuery("from ExpenseEntity where price>=500");
		//Query<ExpenseEntity> query = session.createQuery("from ExpenseEntity where date='07-Oct-23'");
		//Query<ExpenseEntity> query = session.createQuery("from ExpenseEntity where date='07-Oct-23' AND price>=500");
		Query<ExpenseEntity> query = session.createQuery("from ExpenseEntity ORDER BY date DESC");
		
		List<ExpenseEntity> list = query.list();
		for(ExpenseEntity exp : list) {
			System.out.println("Id : " + exp.getId());
			System.out.println("Title : " + exp.getTitle());
			System.out.println("Desc : " + exp.getDesc());
			System.out.println("Date : " + exp.getDate());
			System.out.println("Amount : " + exp.getPrice());
			System.out.println("---------------------------------------");
		}
		tr.commit();
		session.close();
		sf.close();
	}
}










