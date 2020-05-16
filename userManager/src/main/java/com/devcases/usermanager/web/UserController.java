package com.devcases.usermanager.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devcases.usermanager.model.User;
import com.devcases.usermanager.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	@Autowired
    private UserService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(Model model) {
		
		model.addAttribute("users", userService.getAllUsers() );
		
		return "view";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(User user) {
		
		userService.save(new User(user.getPr_firstName(),user.getPr_lastName(),user.getPr_mobileNumber(),user.getPr_email(),user.getPr_addressLine1(),user.getPr_addressLine2(),user.getPr_addressLine3(),user.getPr_postCode(),user.getPr_relationship(),
				user.getDc_firstName(),user.getDc_lastName(),user.getDc_dateOfBirth(),user.getDc_dateOfDeath(),user.getDc_addressLine1(),user.getDc_addressLine2(),user.getDc_addressLine3(),user.getDc_postCode()));
				
				
				
		return "redirect:/";
	}
	
	@RequestMapping(value = "/delete/{userId}", method = RequestMethod.GET)
	public String removeUser(@PathVariable("userId") int userId) {
		
		userService.delete(userId);
		
		return "redirect:/view";
	}
	
}
