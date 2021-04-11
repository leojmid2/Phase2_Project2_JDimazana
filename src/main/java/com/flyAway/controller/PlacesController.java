package com.flyAway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flyAway.model.Place;
import com.flyAway.service.PlacesService;

@Controller
public class PlacesController {

	@Autowired
	PlacesService placesService;
	
	@RequestMapping(value = "/showPlaces",  method = RequestMethod.GET)
	public ModelAndView showPlaces() {
		List<Place> places = placesService.getPlaces();
 		return new ModelAndView("showPlaces", "places", places);
	}
	
}
