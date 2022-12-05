package com.Gururaj.JdbcMaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Persons {
	@Id
		@Column(name="id")
		private int id;
		@Column(name="pName")
		private String pName;
		@Column(name="pAge")
		private int pAge;
		
		Persons(){
		System.out.println("invoking Persons class constructor");	
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getPname() {
			return pName;
		}
		public void setPname(String pName) {
			this.pName=pName;
		}
		public int getPage() {
			return pAge;
		}
		public void setPage(int pAge) {
			this.id=id;
		
		
	}
}
