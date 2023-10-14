package com.entity;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {
	public static void main(String[] args) {
		UserDetails u1 = new UserDetails();
		u1.setName("A");
		u1.setEmail("a@gmail.com");
		u1.setContact("8877889900");
		u1.setCity("Pune");
		TaskDetails t1 = new TaskDetails();
		t1.setTitle("JSP Servlet MVC Application...");
		t1.setDetails("Develop application using JSP servlet MVC");
		t1.setTaskdate(LocalDate.of(2023, 10, 05));
		t1.setStatus("Completed");
		t1.setUserId(u1);
		TaskDetails t2 = new TaskDetails();
		t2.setTitle("JSP Servlet Hibernate MVC Application...");
		t2.setDetails("Develop application using JSP servlet Hibernate MVC");
		t2.setTaskdate(LocalDate.of(2023, 10, 16));
		t2.setStatus("Open");
		t2.setUserId(u1);
		Configuration cfg = new Configuration();
		cfg.configure("hbm-config-mysql.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
			session.save(u1);
			session.save(t1);
			session.save(t2);
		tr.commit();
		session.close();
		sf.close();
	}

}
