package com.ref;

public class B {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public B(String name) {
		super();
		this.name = name;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}


}
