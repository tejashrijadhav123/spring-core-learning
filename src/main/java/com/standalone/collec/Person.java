package com.standalone.collec;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List name;
    private Map<String,Integer>street;
    private Properties prop;
	public List getName() {
		return name;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Map<String, Integer> getStreet() {
		return street;
	}

	public void setName(List name) {
		this.name = name;
	}

	public void setStreet(Map<String, Integer> street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", street=" + street + ", prop=" + prop + "]";
	}

	

	
    
}
