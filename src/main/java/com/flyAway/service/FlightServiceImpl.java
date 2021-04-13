package com.flyAway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flyAway.Dao.FlightsDao;
import com.flyAway.model.Flight;

@Service
@Transactional
public class FlightServiceImpl implements FlightsService {

	@Autowired
	private FlightsDao flightsDao;

	@Override
	public List<Flight> getFlights() {
		return flightsDao.getFlights();
	}

	@Override
	public Flight getFlight(int sourceid, int destinationid, int airlineid) {
		// TODO Auto-generated method stub
		return flightsDao.getFlight(sourceid, destinationid, airlineid);
	}

	@Override
	public List<Flight> getFlights(int sourceid, int destinationid) {
		// TODO Auto-generated method stub
		return flightsDao.getFlights(sourceid, destinationid);
	}

}
