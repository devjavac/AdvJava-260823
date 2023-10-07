import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertExpenses {
	public static void main(String[] args) {
		List<ExpenseEntity> list = new ArrayList<ExpenseEntity>();
		Scanner scan = new  Scanner(System.in);
		for(int i = 1; i<=2; i++) {
			ExpenseEntity ex = new ExpenseEntity();
			System.out.println("Title : ");
			ex.setTitle(scan.next());
			System.out.println("Desciption : ");
			ex.setDesc(scan.next());
			System.out.println("Date (yyyy-mm-dd) : ");
			String date = scan.next();
			ex.setDate(LocalDate.parse(date));
			System.out.println("Price : ");
			ex.setPrice(scan.nextDouble());
			list.add(ex);
		}
		scan.close();
		saveData(list);
	}
	public static void saveData(List<ExpenseEntity> list) {
		Configuration cfg = new  Configuration();
		cfg.configure("hbm-config-oracle.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for(ExpenseEntity obj : list) {
			session.save(obj);
		}
		tr.commit();
		session.close();
		sf.close();
	}
	
	
	

}









