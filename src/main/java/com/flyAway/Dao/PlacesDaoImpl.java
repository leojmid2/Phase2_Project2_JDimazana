package com.flyAway.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flyAway.model.Place;

@Repository
public class PlacesDaoImpl implements PlacesDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Place> getPlaces() {
		return sessionFactory.getCurrentSession().createQuery("from Place").list();
	}

}
