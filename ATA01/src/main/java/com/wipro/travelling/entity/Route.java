package com.wipro.travelling.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Route {
	@Id
	private int routeId;
	private String source;
	private String destination;
	private String noOfKms;
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getNoOfKms() {
		return noOfKms;
	}
	public void setNoOfKms(String noOfKms) {
		this.noOfKms = noOfKms;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", destination=" + destination + ", noOfKms="
				+ noOfKms + "]";
	}
	
	

}
