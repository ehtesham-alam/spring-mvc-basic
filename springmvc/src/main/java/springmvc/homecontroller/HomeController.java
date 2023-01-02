package springmvc.homecontroller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("this is home url...");
		
		model.addAttribute("name", "Awanish kumar singh");
		
		model.addAttribute("id", 12);
		
		List<String> friends = new ArrayList<String>();
		
		friends.add("manish");
		friends.add("sunish");
		friends.add("bhawna");
		
		model.addAttribute("friends",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView view = new ModelAndView();
		
		view.setViewName("help");
		view.addObject("name", "Awanish");
		view.addObject("roll", 1232);
		LocalDateTime time = LocalDateTime.now();
		view.addObject("time",time);
		return view;
		
	}
	
	
	
	
}
