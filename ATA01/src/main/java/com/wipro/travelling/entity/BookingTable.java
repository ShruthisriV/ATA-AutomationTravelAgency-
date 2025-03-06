package com.wipro.travelling.entity;

import javax.persistence.*;

@Entity
@Table(name="BookingTable")
public class BookingTable {
	@Id
	private int bId;
	private int pId;
	private int routeId;
	private String dateoftravel;
	private String dateofbooking;
	private long ratetopay;
	public BookingTable(int bId, int pId, int routeId, String dateoftravel, String dateofbooking, long ratetopay) {
		super();
		this.bId = bId;
		this.pId = pId;
		this.routeId = routeId;
		this.dateoftravel = dateoftravel;
		this.dateofbooking = dateofbooking;
		this.ratetopay = ratetopay;
	}
	public BookingTable() {
		super();
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getDateoftravel() {
		return dateoftravel;
	}
	public void setDateoftravel(String dateoftravel) {
		this.dateoftravel = dateoftravel;
	}
	public String getDateofbooking() {
		return dateofbooking;
	}
	public void setDateofbooking(String dateofbooking) {
		this.dateofbooking = dateofbooking;
	}
	public long getRatetopay() {
		return ratetopay;
	}
	public void setRatetopay(long ratetopay) {
		this.ratetopay = ratetopay;
	}
	
	
	
}
