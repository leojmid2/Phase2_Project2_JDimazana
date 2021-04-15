package com.flyAway.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public String loginAdmin(Model model, @RequestParam String username, @RequestParam String password, HttpSession session ) {
 
		List<User> users = userService.getUser(username, password);

		if (!users.isEmpty()) {
			User user = (User) users.get(0);
			session.setAttribute("loggedInUser", user);
			return "dashboard";
			//return "redirect:/";
		}
		else {
			model.addAttribute("message","Error logging in. Please try again.");
			return "login_admin";

		}

	}
	
	@RequestMapping(value = "/change_password",  method = RequestMethod.GET)
	public ModelAndView changePassword(){
		return new ModelAndView("change_password");
	}
	
	@RequestMapping(value = "/change_password",  method = RequestMethod.POST)
		public ModelAndView savePassword(Model model, @RequestParam String old_password, String password, String password2, HttpSession session ) {
		
			//validate password and new password.
			//check old password 
			User user= (User)session.getAttribute("loggedInUser");
			if (user.getPassword().equals(old_password)) {
				
				//check the two password is the same
				if (password.contentEquals(password2) && (!password.isEmpty())) {
					user.setPassword(password);
					userService.updateEmployee(user);
					System.out.println("new password save");
				}
				else {
					 model.addAttribute("message","New password doesn't match. Please try again");
					return new ModelAndView("change_password");
				}
			}
			else {
				 model.addAttribute("message","Incorrect current password.Please try again.");
				 return new ModelAndView("change_password");
			}
		
			return new ModelAndView("success_password");
	}
	
	@RequestMapping(value = "/logout_admin",  method = RequestMethod.GET)
	public ModelAndView logout_admin(HttpSession session){
		session.removeAttribute("loggedInUser");
		return new ModelAndView("login_admin");
	}

	
}
