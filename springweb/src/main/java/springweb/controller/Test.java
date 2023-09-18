package springweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home page...!!!");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about page ...!!");
		return "about";
	}
	
	//help
	@RequestMapping("/help")
	public String help(Model model) {
		
		model.addAttribute("name","Ashutosh Kumar Tiwari");
		
		return "help";
	}
	
	//Support
	@RequestMapping("/support")
	public ModelAndView support() {
		ModelAndView modelandview = new ModelAndView();
		
		modelandview.addObject("name","Shivam Tiwari");
		
		List<String> list = new ArrayList<String>();
		list.add("2020");
		list.add("1111");
		list.add("2222");
		list.add("3333");
		modelandview.addObject("rollnumber",list);
		
		modelandview.setViewName("support");
		return modelandview;
		
	}

}
