package com.flyAway.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.flyAway.model.Airline;
import com.flyAway.model.Flight;
import com.flyAway.model.Place;
import com.flyAway.service.AirlinesService;
import com.flyAway.service.FlightsService;
import com.flyAway.service.PlacesService;

@Controller
public class FlightsController {

	@Autowired
	FlightsService flightsService;

	@Autowired
	PlacesService placesService;

	@Autowired
	AirlinesService airlinesService;
	
	List<Flight> foundFlights;
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");  
	LocalDateTime now = LocalDateTime.now();  
	

	@RequestMapping(value = "/showFlights",  method = RequestMethod.GET)
	public ModelAndView showFlights() {	
		
		List<Flight> flights = flightsService.getFlights();
 		return new ModelAndView("showFlights", "flights", flights);
	}
	
	
	@RequestMapping(value = "/search",  method = RequestMethod.GET)
	public String search(Model model) {
		
		List<Place> places = placesService.getPlaces();
		model.addAttribute("places", places);
		model.addAttribute("datetoday",dtf.format(now));
		return "search";
	}

	
	@RequestMapping(value = "/search",  method = RequestMethod.POST)
	public String search(Model model, @RequestParam String dot, @RequestParam String num_passenger, 
				@RequestParam String source, @RequestParam String destination) {
 
		if (dot.equals("")) {
			dot = dtf.format(now);
		}
		
		 int sourceid = Integer.valueOf(source);
		 int destinationid = Integer.valueOf(destination);
		 
		 List<Flight> flights = flightsService.getFlights(sourceid,destinationid);
		 
		 if (flights.isEmpty()) {
			 System.out.println("not found");
			 model.addAttribute("message", "No match for the source and destination");
			 model.addAttribute("back","search");
			 return "error";
		 }
		//foundFlights.clear(); 
		//foundFlights.addAll(flights); 
		model.addAttribute("flights", flights);
		model.addAttribute("num_passenger", num_passenger);
		return "result";
	}
	
	@RequestMapping(value = "/register",  method = RequestMethod.GET)
	public ModelAndView registration(@RequestParam String id) {	
		
		int flightid = Integer.valueOf(id);
		
		//List<Flight> flights = flightsService.getFlights();
 		return new ModelAndView("register", "flight", flightid);
	}
	
	@RequestMapping(value = "/register",  method = RequestMethod.POST)
	public ModelAndView saveCustomer() {	
		
		//int flightid = Integer.valueOf(id);
		
		//need validation and save to db
		
		
		//List<Flight> flights = flightsService.getFlights();
 		return new ModelAndView("payment");
	}

	@RequestMapping(value = "/payment",  method = RequestMethod.GET)
	public ModelAndView payment() {	
		
//		int flightid = Integer.valueOf(id);
		
		//need validation and save to db
		
		
		//List<Flight> flights = flightsService.getFlights();
 		return new ModelAndView("payment");
	}
	@RequestMapping(value = "/payment",  method = RequestMethod.POST)
	public ModelAndView bookDetails() {	
		
//		int flightid = Integer.valueOf(id);
		
		
		
		//List<Flight> flights = flightsService.getFlights();
 		return new ModelAndView("bookDetails");
	}


}
