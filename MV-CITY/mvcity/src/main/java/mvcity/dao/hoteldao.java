package mvcity.dao;

import org.springframework.stereotype.Component;

import mvcity.model.Hotels;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class hoteldao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	//create
	@Transactional
	public void createHotel(Hotels hotel)
	{
		
		this.hibernateTemplate.saveOrUpdate(hotel);
		
	}
	//get all products
	public List<Hotels> getHotels()
	{
		List<Hotels> hotels = this.hibernateTemplate.loadAll(Hotels.class);
		return hotels;
	}
	//delete single product
	public void deleteHotel(int hid)
	{
		Hotels p=this.hibernateTemplate.load(Hotels.class, hid);
		this.hibernateTemplate.delete(p);
	}
	//get single product
	public Hotels getHotel(int hid)
	{
		return this.hibernateTemplate.get(Hotels.class,hid);
	}

}


