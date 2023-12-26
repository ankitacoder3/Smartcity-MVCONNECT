package mvcity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String cityname;
	private int  hotels;
	private int  restaurant;
	private int type;
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + cityname + ", description=" + hotels + ", No of hotels=" 
				+ ", getId()=" + getId() + ", getCityname()=" + getCityname() + ", getHotels()=" + getHotels()
				+ ", getRestaurant()=" + getRestaurant() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String cityname, int hotels, int restaurant, int type) {
		super();
		this.id = id;
		this.cityname =cityname;
		this.hotels =hotels;
		this.restaurant = restaurant;
		this.type-type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityname() {
		return cityname;
	}
	public void setName(String Cityname) {
		this.cityname = Cityname;
	}
	public int getHotels() {
		return hotels;
	}
	public void setDescription(int description) {
		this.hotels = description;
	}
	public long getRestaurant() {
		return restaurant;
	}
	public void setPrice(int Price) {
		this.restaurant = Price;
	}
	public void setType(int t) {
		this.type = t;
	}
	public int getType (){
		return type;
	}
	

}
