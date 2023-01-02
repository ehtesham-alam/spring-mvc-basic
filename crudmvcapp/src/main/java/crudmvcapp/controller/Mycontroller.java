package crudmvcapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import crudmvcapp.dao.ProductDao;
import crudmvcapp.entity.Product;

@Controller
public class Mycontroller {
	
	@Autowired
	crudmvcapp.services.Service service;

	@RequestMapping("/")
	public String home(Model model) {
		
		List<Product> product = service.getAllproducts();
		model.addAttribute("products", product);
		
		return "home";
	}
}
