package com.flyAway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="flights")
public class Flight {
	
	@Id
	@Column (name="flightid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long flightid;
	

	public long getflightid() {
		return flightid;
	}


	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
