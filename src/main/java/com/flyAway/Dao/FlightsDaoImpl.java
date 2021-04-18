package com.flyAway.Dao;

import java.util.List;

import org.hibernate.Query;
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


	@Override
	public Flight getFlight(int sourceid, int destinationid, int airlineid) {
		// TODO Auto-generated method stub
		Query q = sessionFactory.getCurrentSession().createQuery("from Flight WHERE sourceid = :sourceid "
				+ "AND destinationId = :destinationid  AND airlineId = :airlineid");
		q.setInteger("sourceid", sourceid);
		q.setInteger("destinationid", destinationid);
		q.setInteger("airlineid", airlineid);
		q.setMaxResults(1);
		return (Flight) q.uniqueResult();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Flight> getFlights(int sourceid, int destinationid) {
		// TODO Auto-generated method stub
	
		Query q = sessionFactory.getCurrentSession().createQuery("from Flight WHERE sourceid = :sourceid "
				+ "AND destinationId = :destinationid");
		q.setInteger("sourceid", sourceid);
		q.setInteger("destinationid", destinationid);
		return q.list();
		//return sessionFactory.getCurrentSession().createQuery("from Flight WHERE sourceid = 10001").list();

		
		
	}


	@Override
	public Flight getFlight(long flightId) {
		return (Flight)sessionFactory.getCurrentSession().get(Flight.class, flightId);
	}


	@Override
	public void addFlight(Flight flight) {
		sessionFactory.getCurrentSession().saveOrUpdate(flight);
		
		
	}

}
