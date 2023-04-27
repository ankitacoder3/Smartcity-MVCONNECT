package movico.dao;

import org.springframework.stereotype.Component;

import movico.model.Malls;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class malldao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	//create
	@Transactional
	public void createMall(Malls mall)
	{
		
		this.hibernateTemplate.saveOrUpdate(mall);
		
	}
	//get all products
	public List<Malls> getMalls()
	{
		List<Malls> a = this.hibernateTemplate.loadAll(Malls.class);
		return a;
	}
	//delete single product
	public void deleteMall(int mid)
	{
		Malls k=this.hibernateTemplate.load(Malls.class, mid);
		this.hibernateTemplate.delete(k);
	}
	//get single product
	public Malls getMall(int mid)
	{
		return this.hibernateTemplate.get(Malls.class,mid);
	}

}


