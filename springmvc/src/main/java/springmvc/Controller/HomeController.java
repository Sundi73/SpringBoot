package springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home page.");
		return "index";
	}
	
	@RequestMapping("/about")
	public String About() {
		System.out.println("this about page");
		return "about";
	}
	
}
