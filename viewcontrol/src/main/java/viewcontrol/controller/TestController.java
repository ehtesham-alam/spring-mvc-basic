package viewcontrol.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import viewcontrol.entity.User;
import viewcontrol.userservice.UserService;

@Controller
public class TestController {

	@RequestMapping("/")
	public String home() {

		return "index";

	}

	/*
	 * @RequestMapping(path = "processform", method = RequestMethod.POST) public
	 * String process(HttpServletRequest request,
	 * 
	 * @RequestParam("email") String email, @RequestParam("name") String
	 * name, @RequestParam("pass") String pass, Model model
	 * 
	 * ) {
	 * 
	 * model.addAttribute("name", name); model.addAttribute("email", email);
	 * model.addAttribute("password", pass);
	 * 
	 * 
	 * System.out.println("hello this is awanish kumar singh");
	 * 
	 * String name1 = request.getParameter("name"); String email1 =
	 * request.getParameter("email"); String pass1 = request.getParameter("pass");
	 * 
	 * System.out.println(name1); System.out.println(email1);
	 * System.out.println(pass1); System.out.println(); System.out.println();
	 * 
	 * System.out.println(name); System.out.println(email);
	 * System.out.println(pass);
	 * 
	 * return "submit"; }
	 * 
	 * 
	 */

	/*
	 * @RequestMapping(path = "processform" , method = RequestMethod.POST) public
	 * String home(@RequestParam("name")String name,
	 * 
	 * @RequestParam("email")String email,
	 * 
	 * @RequestParam("pass")String password,Model model ) {
	 * 
	 * 
	 * User user = new User(); user.setEmail(email); user.setPassword(password);
	 * user.setName(name); model.addAttribute("user",user);
	 * System.out.println(user); return "submit";
	 * 
	 * }
	 */

	@Autowired
	UserService userService;

	@RequestMapping(path = "processform", method = RequestMethod.POST)
	public String name(@ModelAttribute User user) {
		userService.createUser(user);
		return "submit";
	}
}
