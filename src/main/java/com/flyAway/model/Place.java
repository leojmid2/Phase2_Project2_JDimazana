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
@Table (name="places")
public class Place {
	
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Place(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Id
	@Column(name="placeid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long placeid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="country")
	private String country;
	
	public long getPlaceid() {
		return placeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

/*	
 * 	ONLY NEEDED IF BI-DIRECTIONAL
 * 
	//the mappedBy=source (small letter) is the reference of Flight in the Place class
	@OneToMany(fetch = FetchType.EAGER, mappedBy="source",cascade = CascadeType.ALL)
	private Set<Flight> flight;

	//the mappedBy=source (small letter) is the reference of Flight in the Place class
	@OneToMany(fetch = FetchType.EAGER, mappedBy="destination",cascade = CascadeType.ALL)
	private Set<Flight> flight2;


	public Set<Flight> getFlight2() {
		return flight2;
	}

	public void setFlight2(Set<Flight> flight2) {
		this.flight2 = flight2;
	}

	public Set<Flight> getFlight() {
		return flight;
	}

	public void setFlight(Set<Flight> flight) {
		this.flight = flight;
	}

*/	
	

}
