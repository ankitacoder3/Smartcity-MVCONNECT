package mvcity.dao;

import org.springframework.stereotype.Component;

import mvcity.model.Theatres;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class theatredao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	//create
	@Transactional
	public void createTheatre(Theatres theatre)
	{
		
		this.hibernateTemplate.saveOrUpdate(theatre);
		
	}
	//get all products
	public List<Theatres> getTheatres()
	{
		List<Theatres> theatre = this.hibernateTemplate.loadAll(Theatres.class);
		return theatre;
	}
	//delete single product
	public void deleteTheatre(int tid)
	{
		Theatres p=this.hibernateTemplate.load(Theatres.class, tid);
		this.hibernateTemplate.delete(p);
	}
	//get single product
	public Theatres getTheatre(int tid)
	{
		return this.hibernateTemplate.get(Theatres.class,tid);
	}

}


