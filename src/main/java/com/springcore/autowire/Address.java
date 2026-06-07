package com.springcore.autowire;

public class Address {
	private String street;
	private String name;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address(String street, String name) {
		super();
		this.street = street;
		this.name = name;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", name=" + name + "]";
	}

}
