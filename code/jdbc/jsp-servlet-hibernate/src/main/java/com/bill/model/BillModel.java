package com.bill.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bill.entity.BillEntity;

public class BillModel {
	public int saveBill(BillEntity entity) {
		Configuration cfg = new Configuration();
		cfg.configure("hbm-config-mysql.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
			session.save(entity);
		tr.commit();
		session.close();
		sf.close();
		return 1;
	}
	
}
