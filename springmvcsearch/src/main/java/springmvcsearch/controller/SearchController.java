package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SearchController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		
		
		String url = ("https://www.google.com/search?q="+query);
		
		RedirectView redirect = new RedirectView();
		if(query.isBlank())
			redirect.setUrl("home");
		else
			redirect.setUrl(url);
		
		return redirect;
	}
	
	@RequestMapping("/form")
	public String form() {
		return "complex";
	}
	@RequestMapping(path = "/handle", method=RequestMethod.POST)
	public String formHandle(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "success";
	}

}
