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

}
