package com.flyAway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

	
	@RequestMapping(value = "/search",  method = RequestMethod.GET)
	public ModelAndView loginAdmin() {
 
		return new ModelAndView("search");
	}

}
