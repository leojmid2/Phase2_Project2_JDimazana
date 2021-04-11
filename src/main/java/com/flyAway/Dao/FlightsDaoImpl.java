package com.flyAway.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flyAway.model.Flight;

@Repository
public class FlightsDaoImpl implements FlightsDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Flight> getFlights() {
		//the from Flight is the java class Flight not the table
		return sessionFactory.getCurrentSession().createQuery("from Flight").list();
	}

}
