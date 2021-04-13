package com.flyAway.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.flyAway.model.User;
import com.flyAway.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;


	@RequestMapping(value = "/login_admin",  method = RequestMethod.GET)
	public ModelAndView loginAdmin() {
 
		return new ModelAndView("login_admin");
	}
	

	@RequestMapping(value = "/login_admin",  method = RequestMethod.POST)
	public ModelAndView loginAdmin(Model model, @RequestParam String username, @RequestParam String password ) {
 
		List<User> users = userService.getUser(username, password);

		if (!users.isEmpty()) {
			User user = (User) users.get(0);
			return new ModelAndView("dashboard", "user", user);
		}
		else {
			 model.addAttribute("back","change_password");
			return new ModelAndView("error","message",username + " doesn't exist. Please try again.");
		}

	}
	
	@RequestMapping(value = "/change_password",  method = RequestMethod.GET)
	public ModelAndView changePassword(@RequestParam int id){
		return new ModelAndView("change_password","id",id);
	}
	
	@RequestMapping(value = "/change_password",  method = RequestMethod.POST)
		public ModelAndView savePassword(Model model, @RequestParam int userid, @RequestParam String old_password, String password, String password2) {
		
			//validate password and new password.
			//check old password 
			User user = (User) userService.getUser(userid);
			if (user.getPassword().equals(old_password)) {
				
				//check the two password is the same
				if (password.contentEquals(password2)) {
					user.setPassword(password);
					userService.updateEmployee(user);
					System.out.println("new password save");
				}
				else {
					 model.addAttribute("back","change_password");
					return new ModelAndView("error","message", "New password doesn't match.Please try again");
				}
			}
			else {
				 model.addAttribute("back","change_password");
				return new ModelAndView("error","message", "Incorrect current password.Please try again");

			}
		
			//System.out.println("user id " + userid);
			return new ModelAndView("success_password");
	}
	
}
