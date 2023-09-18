package springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springweb.model.User;
import springweb.service.UserService;

@Controller
public class contactController {
	@Autowired
	private UserService userService;

	@RequestMapping("/contact")
	public String show() {
		return "contact";
	}
	
	@RequestMapping(path ="/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		
		this.userService.createUser(user);
		
		//model.addAttribute("user", user);
		return "success";
	}
		
	
}

/* @RequestMapping(path="/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email, @RequestParam("username")String username, 
			@RequestParam("password")String password,Model model) {
		
		
		System.out.println("EmailId:  "+email);
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		
		
		model.addAttribute("email",email);
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		
		// logic for database
		
		return "success";
		
	}*/
