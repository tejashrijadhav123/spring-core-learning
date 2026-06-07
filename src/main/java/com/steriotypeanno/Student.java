package com.steriotypeanno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("b")
public class Student {
	@Value("teju")
     private String name;
	@Value("11")
     private int id;
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Value("#{temp}")
	 private List<String> address;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 @Override
	 public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	 }
	
}
