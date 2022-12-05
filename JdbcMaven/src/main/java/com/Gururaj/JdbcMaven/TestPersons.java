package com.Gururaj.JdbcMaven;

import com.Gururaj.JdbcMaven.dao.PersonsDao;
import com.Gururaj.JdbcMaven.entity.Persons;

public class TestPersons {
	public static void main(String[] args) {
		
	PersonsDao dao=new PersonsDao();
	dao.getAll();
	Persons persons=new Persons();
	persons.setId(4);
	persons.setPname("Virat");
	persons.setPage(34);
	
//	dao.save(persons);
	
	dao.update("Yuvarajkm", 1);

}
}
