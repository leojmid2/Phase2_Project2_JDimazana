package com.flyAway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Airlines")
public class Airline {

	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airline(String name) {
		super();
		this.name = name;
	}

	@Id
	@Column(name="airlineId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long airlineId;
	
	@Column(name="name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAirlineId() {
		return airlineId;
	}
	
	
	
	
	
}
