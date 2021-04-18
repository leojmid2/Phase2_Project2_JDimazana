package com.flyAway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(value = "/newPlace",  method = RequestMethod.GET)
	public ModelAndView newPlace(Model model) {
		Place place = new Place();
		return new ModelAndView("placeForm", "place", place);
	}
	
	@RequestMapping(value = "/savePlace",  method = RequestMethod.POST)
	public String savePlace(@ModelAttribute Place place, Model model) {
		
		if (place.getName().equals("") || place.getCountry().equals("")) {
			model.addAttribute("message",  "Invalid input. Try again");
			return "placeForm";
		}
		
		placesService.addPlace(place);
		return "redirect:/showPlaces";
	}
	
}
