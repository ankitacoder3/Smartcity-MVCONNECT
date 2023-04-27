package movico.dao;

import org.springframework.stereotype.Component;

import movico.model.Product;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class movicodao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	//create
	@Transactional
	public void createProduct(Product product)
	{
		
		this.hibernateTemplate.saveOrUpdate(product);
		
	}
	//get all products
	public List<Product> getProducts()
	{
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	//delete single product
	public void deleteProduct(int pid)
	{
		Product p=this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	//get single product
	public Product getProduct(int pid)
	{
		return this.hibernateTemplate.get(Product.class,pid);
	}

}


