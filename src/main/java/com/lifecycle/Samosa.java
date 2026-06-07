package com.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init()
	{
		 System.out.println("i am in init");
	}
	public void destroy()
	{
		 System.out.println("i am in destroy");
	}

}
