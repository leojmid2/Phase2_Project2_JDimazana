package com.flyAway.Dao;

import java.util.List;

import com.flyAway.model.Airline;

public interface AirlinesDao {
	
	public List<Airline> getAirlines();

	public void addAirline(Airline airline);
}
