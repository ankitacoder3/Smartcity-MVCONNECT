package mvcity.dao;

import org.springframework.stereotype.Component;

import mvcity.model.Atm;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class atmdao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	//create
	@Transactional
	public void createAtm(Atm atm)
	{
		
		this.hibernateTemplate.saveOrUpdate(atm);
		
	}
	//get all products
	public List<Atm> getAtms()
	{
		List<Atm> a = this.hibernateTemplate.loadAll(Atm.class);
		return a;
	}
	//delete single product
	public void deleteAtm(int aid)
	{
		Atm k=this.hibernateTemplate.load(Atm.class, aid);
		this.hibernateTemplate.delete(k);
	}
	//get single product
	public Atm getAtm(int aid)
	{
		return this.hibernateTemplate.get(Atm.class,aid);
	}

}


