package com.flyAway.controller;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flyAway.model.Airline;
import com.flyAway.model.Flight;
import com.flyAway.service.FlightsService;

@Controller
public class FlightsController {

	@Autowired
	FlightsService flightsService;
	
	@RequestMapping(value = "/showFlights",  method = RequestMethod.GET)
	public ModelAndView showPlaces() {
		List<Flight> flights = flightsService.getFlights();
		for(Flight f:flights) {
			System.out.println("airline"+ f.getAirline().getName());
			System.out.println("airline"+ f.getSource().getName());
			System.out.println("airline"+ f.getDestination().getName());
			System.out.println("airline"+ f.getDestination().getPlaceid());
		}
 		return new ModelAndView("showFlights", "flights", flights);
	}
	
}
