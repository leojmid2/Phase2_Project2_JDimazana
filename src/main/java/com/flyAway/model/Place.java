package com.flyAway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	

}
