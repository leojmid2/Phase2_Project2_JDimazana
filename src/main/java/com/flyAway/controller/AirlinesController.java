package com.flyAway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flyAway.model.Airline;
import com.flyAway.model.Flight;
import com.flyAway.model.Place;
import com.flyAway.service.AirlinesService;
import com.flyAway.service.PlacesService;

@Controller
public class AirlinesController {
	
	@Autowired
	AirlinesService airlinesService;
	
	@RequestMapping(value = "/showAirlines",  method = RequestMethod.GET)
	public ModelAndView showPlaces() {
		List<Airline> airlines = airlinesService.getAirlines();
 		return new ModelAndView("showAirlines", "airlines", airlines);
	}
	
	@RequestMapping(value = "/newAirline",  method = RequestMethod.GET)
	public ModelAndView newAirline(Model model) {
		Airline airline = new Airline();
		return new ModelAndView("airlineForm", "airline", airline);
	}
	
	@RequestMapping(value = "/saveAirline",  method = RequestMethod.POST)
	public String saveAirline(@ModelAttribute Airline airline, Model model) {
		
		if(airline.getName().equals("")) {
			model.addAttribute("message", "Please enter a valid Airline.");
			return "airlineForm";
		}
		airlinesService.addAirline(airline);
		return "redirect:/showAirlines";
	}
	
}
