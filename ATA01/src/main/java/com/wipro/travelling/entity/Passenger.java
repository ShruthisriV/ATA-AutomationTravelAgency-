package com.wipro.travelling.entity;

import javax.persistence.*;

@Entity
@Table(name="Passenger")
public class Passenger {
	@Id
	private int pId;
	private String pname;
	private int age;
	private Integer phoneno;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Integer phoneno) {
		this.phoneno = phoneno;
	}
	public Passenger(int pId, String pname, int age, Integer phoneno) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.age = age;
		this.phoneno = phoneno;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
