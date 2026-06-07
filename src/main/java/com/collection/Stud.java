package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Stud {
	private String name;
	private List mobileno;
	private Set city;
	private Map details;
	private Properties prop;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getMobileno() {
		return mobileno;
	}
	public void setMobileno(List mobileno) {
		this.mobileno = mobileno;
	}
	public Set getCity() {
		return city;
	}
	public void setCity(Set city) {
		this.city = city;
	}
	public Map getDetails() {
		return details;
	}
	public void setDetails(Map details) {
		this.details = details;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stud(String name, List mobileno, Set city, Map details, Properties prop) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.city = city;
		this.details = details;
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "Stud [name=" + name + ", mobileno=" + mobileno + ", city=" + city + ", details=" + details + ", prop="
				+ prop + "]";
	}




}
