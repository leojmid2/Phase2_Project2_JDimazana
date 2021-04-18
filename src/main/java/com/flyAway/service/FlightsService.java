package com.flyAway.service;

import java.util.List;

import com.flyAway.model.Flight;

public interface FlightsService {
	
	public List<Flight> getFlights();

	public Flight getFlight(int sourceid, int destinationid, int airlineid);
	
	public List<Flight> getFlights(int sourceid, int destinationid);
	
	public Flight getFlight(long flightId);
	
	public void addFlight(Flight flight);

}
