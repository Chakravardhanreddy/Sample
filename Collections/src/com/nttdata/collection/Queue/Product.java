package com.nttdata.collection.Queue;

public class Product implements Comparable<Product> {
	
	int prodId;
	String name,comp;
	double price;
	public Product(int prodId, String name, String comp, double price) {
		super();
		this.prodId = prodId;
		this.name = name;
		this.comp = comp;
		this.price = price;
	}
	
	@Override
	public int compareTo(Product o)
	{
		if(o.prodId<this.prodId)
		{
			return 1;
			
		}
		else if(o.prodId>this.prodId)
		{
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", name=" + name + ", comp=" + comp + ", price=" + price + "]";
	}
	

}








