package crudmvcapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import crudmvcapp.dao.ProductDao;
import crudmvcapp.entity.Product;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	public ProductDao dao;

	public int createProduct(Product product) {
		
		int i = (Integer)dao.createProduct(product);
		return i;
	}
	
	public List<Product>  getAllproducts(){
		
		List<Product> list = dao.getAllProducts();
		return list;
		
	}
	

}
