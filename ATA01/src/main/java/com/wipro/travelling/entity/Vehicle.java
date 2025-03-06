package com.wipro.travelling.entity;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Vehicle {
	
	@Id
	private int vId;
	private String vName;
	private String vType;
	private int vNoOfSeats;
	private String vAcOrNonAc;
	private double vPerKmRate;
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getvType() {
		return vType;
	}
	public void setvType(String vType) {
		this.vType = vType;
	}
	public int getvNoOfSeats() {
		return vNoOfSeats;
	}
	public void setvNoOfSeats(int vNoOfSeats) {
		this.vNoOfSeats = vNoOfSeats;
	}
	public String getvAcOrNonAc() {
		return vAcOrNonAc;
	}
	public void setvAcOrNonAc(String vAcOrNonAc) {
		this.vAcOrNonAc = vAcOrNonAc;
	}
	public double getvPerKmRate() {
		return vPerKmRate;
	}
	public void setvPerKmRate(double vPerKmRate) {
		this.vPerKmRate = vPerKmRate;
	}
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vName=" + vName + ", vType=" + vType + ", vNoOfSeats=" + vNoOfSeats
				+ ", vAcOrNonAc=" + vAcOrNonAc + ", vPerKmRate=" + vPerKmRate + "]";
	}
	
	

}
