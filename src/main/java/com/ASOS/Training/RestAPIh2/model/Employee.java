package com.ASOS.Training.RestAPIh2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int eid;
	
	private String ename;
	private String role;
	public Employee() {
		super();
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getrole() {
		return role;
	}
	public void setrole(String role) {
		this.role = role;
	}
	public Employee(int eid, String ename, String role) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.role = role;
	}

}
