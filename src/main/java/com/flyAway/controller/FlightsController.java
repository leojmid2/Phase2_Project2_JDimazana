package com.flyAway.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.flyAway.model.Airline;
import com.flyAway.model.Flight;
import com.flyAway.model.Place;
import com.flyAway.model.Registration;
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
	
	Registration reg;
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");  
	LocalDateTime now = LocalDateTime.now();  
	

	@RequestMapping(value = "/showFlights",  method = RequestMethod.GET)
	public ModelAndView showFlights() {	
		
		List<Flight> flights = flightsService.getFlights();
 		return new ModelAndView("showFlights", "flights", flights);
	}
	
	
	//@RequestMapping(value = "/search",  method = RequestMethod.GET)
	@RequestMapping(value = "/",  method = RequestMethod.GET)
	public String search(Model model, HttpSession session) {
		
		reg = null;
		List<Place> places = placesService.getPlaces();
		model.addAttribute("datetoday",dtf.format(now));
		session.setAttribute("places", places);
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
			 model.addAttribute("message", "No match for the source and destination");
			 reg=null;
			 
			 return "search";
		 }
		 
		reg=new Registration();
		reg.setDot(dot);
		reg.setNum_passenger(num_passenger);
		model.addAttribute("flights", flights);
		model.addAttribute("num_passenger", num_passenger);
		return "result";
	}
	
	@RequestMapping(value = "/register",  method = RequestMethod.GET)
	public ModelAndView registration(@RequestParam String id) {	
		
		int flightid = Integer.valueOf(id);
 		reg.setFlightid(flightid);
 		return new ModelAndView("register");
	}
	
	@RequestMapping(value = "/register",  method = RequestMethod.POST)
	public String saveCustomer(RedirectAttributes rda, Model model, @RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, @RequestParam String telno) {	
		
		rda.addAttribute("id", reg.getFlightid());
		if (firstname.equals("")) {
			rda.addFlashAttribute("message", "First name cannot be blank");
			return "redirect:/register";
		}
		if (lastname.equals("")) {
			rda.addFlashAttribute("message", "Last name cannot be blank");
			return "redirect:/register";
		}
		if (email.equals("")) {
			rda.addFlashAttribute("message", "Email cannot be blank");
			return "redirect:/register";
		}
		
		Flight flight = flightsService.getFlight(reg.getFlightid());
		reg.setFirstname(firstname);
		reg.setLastname(lastname);
		reg.setEmail(email);
		reg.setTelno(telno);
		reg.setPrice(flight.getPrice());
		reg.setTotalPrice(flight.getPrice()*Integer.valueOf(reg.getNum_passenger()));
		reg.setAirline(flight.getAirline().getName());
		reg.setSource(flight.getSource().getName());
		reg.setDestination(flight.getDestination().getName());
		
 		return "payment";
	}

	@RequestMapping(value = "/payment",  method = RequestMethod.GET)
	public ModelAndView payment() {	
 		return new ModelAndView("payment");
	}
	
	@RequestMapping(value = "/payment",  method = RequestMethod.POST)
	public ModelAndView bookDetails(Model model, @RequestParam String name, @RequestParam String ccn, @RequestParam String exp, @RequestParam String cvv  ) {	
		
		if (name.equals("")) {
			model.addAttribute("message", "Please enter a valid name");
			return new ModelAndView("payment");
		}
		
		
		
		if (ccn.equals("")) {
			model.addAttribute("message", "Please enter a valid Credit card number");
			return new ModelAndView("payment");
		}
		if (exp.equals("")) {
			model.addAttribute("message", "Please select a valid date");
			return new ModelAndView("payment");
		}

		if (cvv.equals("")) {
			model.addAttribute("message", "Please enter a valid CVV");
			return new ModelAndView("payment");
		}


		model.addAttribute("reg", reg);
		reg = null;
 		return new ModelAndView("bookDetails");
	}


}
