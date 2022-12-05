package com.Gururaj.JdbcMaven.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Gururaj.JdbcMaven.entity.Persons;

public class PersonsDao {
	
	public void getAll() {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session= factory.openSession();
		
		Persons persons=session.get(Persons.class,1);
		System.out.println(persons);
		Persons persons1=session.get(Persons.class,2);
		System.out.println(persons1);
		
		session.close();
	}

}
