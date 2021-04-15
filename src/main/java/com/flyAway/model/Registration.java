package com.flyAway.model;

import java.util.Date;

public class Registration {
	
	private int regid;
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private String telno;

	private String dot;
	
	private String num_passenger;
	
	private double totalPrice;
	
	private long flightid;
	
	private String source;
	
	private String destination;
	
	private String airline;
	
	private double price;
	
	

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(String firstname, String lastname, String email, String telno, String dot, String num_passenger,
			double price, double totalPrice, long flightid) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.telno = telno;
		this.dot = dot;
		this.num_passenger = num_passenger;
		this.totalPrice = totalPrice;
		this.flightid = flightid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno2) {
		this.telno = telno2;
	}

	public String getDot() {
		return dot;
	}

	public void setDot(String dot2) {
		this.dot = dot2;
	}

	public String getNum_passenger() {
		return num_passenger;
	}

	public void setNum_passenger(String num_passenger2) {
		this.num_passenger = num_passenger2;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double d) {
		this.totalPrice = d;
	}

	public long getFlightid() {
		return flightid;
	}

	public void setFlightid(long flightid) {
		this.flightid = flightid;
	}

	public int getRegid() {
		return regid;
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

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
