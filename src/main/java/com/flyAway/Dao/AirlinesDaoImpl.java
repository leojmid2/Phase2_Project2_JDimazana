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
		return sessionFactory.getCurrentSession().createQuery("from airlines").list();
	}

}
