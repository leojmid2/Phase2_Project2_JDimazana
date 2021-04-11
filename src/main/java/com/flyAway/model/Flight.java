package com.flyAway.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="flights")
public class Flight {
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@Column (name="flightid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long flightid;
		
	

	//Many Flights to ONE source
	//sourceid is the foreign key
	@ManyToOne
	@JoinColumn (name="sourceid")
	private Place source;

	//Many Flights to ONE destination
	//destinationid is the foreign key
	@ManyToOne
	@JoinColumn (name="destinationid")
	private Place destination;
	
	//Many Flights to ONE airline
	//airlineId is the foreign key
	@ManyToOne
	@JoinColumn(name ="airlineId")
	private Airline airline;
	
	
	@Column (name="price")
	private double price;
	

	public long getflightid() {
		return flightid;
	}
	
	
	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}


	public Place getSource() {
		return source;
	}


	public void setSource(Place source) {
		this.source = source;
	}


	public Place getDestination() {
		return destination;
	}


	public void setDestination(Place destination) {
		this.destination = destination;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	
	


	
	
	

	

}
