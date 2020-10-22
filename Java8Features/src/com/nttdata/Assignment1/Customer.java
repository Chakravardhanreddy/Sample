package com.nttdata.Assignment1;



public class Customer {
	
	int id;
	String name,password,city;
	int price;
	public Customer(int id, String name, String password, String city, int price) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.city = city;
		this.price = price;
	}
	
	
	
	
	
	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getCity() {
		return city;
	}





	public void setCity(String city) {
		this.city = city;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", city=" + city + ", price="
				+ price + "]";
	}
	
	
	

}
