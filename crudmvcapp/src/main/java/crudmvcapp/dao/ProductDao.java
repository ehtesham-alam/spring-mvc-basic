package crudmvcapp.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import crudmvcapp.entity.Product;

@Repository
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int createProduct(Product product) {
		int save = (Integer)this.hibernateTemplate.save(product);
		return save;
	}

	public List<Product> getAllProducts() {

		List<Product> loadAll = this.hibernateTemplate.loadAll(Product.class);
	
		return loadAll;
	}
	
	public Product getProduct(int id) {
		Product product = this.hibernateTemplate.load(Product.class, id);
		return product;
	}
	
	@Transactional
	public void deleteProduct(int id) {
		Product product = this.hibernateTemplate.load(Product.class, id);
		this.hibernateTemplate.delete(product);
	}

	@Transactional
	public void updateProduct(Product p) {
		this.hibernateTemplate.update(p);
	}
	
}
