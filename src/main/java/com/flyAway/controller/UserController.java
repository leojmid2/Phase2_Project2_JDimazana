package com.flyAway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><h3> Hello World, Spring MVC Tutorial</h3><br>";
		return new ModelAndView("welcome", "message", message);
	}

	
}
