package com.flyAway.Dao;

import java.util.List;

import com.flyAway.model.Flight;

public interface FlightsDao {
	
	public List<Flight> getFlights();
	
	public Flight getFlight(int sourceid, int destinationid, int airlineid);
	
	public List<Flight> getFlights(int sourceid, int destinationid);

}
