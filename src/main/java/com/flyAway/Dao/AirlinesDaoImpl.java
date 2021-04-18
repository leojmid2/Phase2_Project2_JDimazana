package com.flyAway.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flyAway.model.Airline;

@Repository
public class AirlinesDaoImpl implements AirlinesDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Airline> getAirlines() {
		
		
		/*String HQL = "SELECT f.flightId, p.name source, d.name destination, a.name airline, f.price FROM BookingDB.flights f INNER JOIN BookingDB.airlines a ON f.airlineId = a.airlineId "
				+ "			INNER JOIN BookingDB.places p ON f.sourceId = p.placeId  "
				+ "			INNER JOIN BookingDB.places d ON f.destinationId = d.placeId";
		return sessionFactory.getCurrentSession().createQuery(HQL).list();
		*/
		return sessionFactory.getCurrentSession().createQuery("from Airline").list();
	}


	@Override
	public void addAirline(Airline airline) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(airline);
	}

}
