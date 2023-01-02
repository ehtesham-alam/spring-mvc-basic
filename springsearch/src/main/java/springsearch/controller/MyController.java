package springsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("searchbox") String name) {
		RedirectView redirectView = new RedirectView();
		String url = "https://www.google.com/search?q=" + name;
		redirectView.setUrl(url);
		return redirectView;
	}
}