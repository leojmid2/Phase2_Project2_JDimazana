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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
		
	//the mappedBy=airline (small first letter) entity Airline
	@OneToMany(fetch = FetchType.EAGER, mappedBy="airline",cascade = CascadeType.ALL)
	private Set<Flight> flight;
	

	public Set<Flight> getFlight() {
		return flight;
	}

	public void setFlight(Set<Flight> flight) {
		this.flight = flight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAirlineId() {
		return airlineId;
	}

/*	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
*/
	/*@Override
	public String toString() {
		return "Airline [airlineId=" + airlineId + ", name=" + name + ", flight=" + flight + "]";
	}
	
	*/
	
	
	
}
