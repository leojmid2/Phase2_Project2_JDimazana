package com.flyAway.Dao;

import java.util.List;

import com.flyAway.model.Place;


public interface PlacesDao {
	
	public List<Place> getPlaces();
	
	public void addPlace (Place place);

}
