package com.Gururaj.JdbcMaven.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Gururaj.JdbcMaven.entity.Persons;


public class PersonsDao {
	
	private SessionFactory factory=null;
	private Object details;
	
	public PersonsDao(){
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory factory=configuration.buildSessionFactory();
	}
	
	
	public void getAll() {
		Session session= factory.openSession();
		Persons persons=session.get(Persons.class,1);
		System.out.println(persons);
		Persons persons1=session.get(Persons.class,2);
		System.out.println(persons1);
		
		session.close();
	}

	public void save(Persons persons) {
		Session session= factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(persons);
		System.out.println("Data saved");
		transaction.commit();
		session.close();
	}
	
	public void update(String pName,int id) {
		Session session= factory.openSession();
	    Persons persons=session.get(Persons.class,id);
	    persons.setPname(pName);
	    Transaction transaction=session.beginTransaction();
	
	    session.save(persons);
	    transaction.commit();
		
	}
}
