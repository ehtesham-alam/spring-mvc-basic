package view_to_controller.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/")
	public String getName() {
		System.out.println("home is fired..");
		return "home";
		
	}
	
}
