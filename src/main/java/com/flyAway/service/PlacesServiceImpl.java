package com.flyAway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flyAway.Dao.PlacesDao;
import com.flyAway.model.Place;

@Service
@Transactional
public class PlacesServiceImpl implements PlacesService {

	@Autowired
	private PlacesDao placesDao;

	@Override
	public List<Place> getPlaces() {
		return placesDao.getPlaces();
	}

	@Override
	@Transactional
	public void addPlace(Place place) {
		placesDao.addPlace(place);
	}

}
