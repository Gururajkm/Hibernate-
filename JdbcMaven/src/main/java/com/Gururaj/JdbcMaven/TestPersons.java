package com.Gururaj.JdbcMaven;

import com.Gururaj.JdbcMaven.dao.PersonsDao;

public class TestPersons {
	public static void main(String[] args) {
		
	PersonsDao dao=new PersonsDao();
	dao.getAll();

}
}