package com.removexml;

import org.springframework.stereotype.Component;

//@Component
public class Student {
	  private Samosa samosa;
       
	   public Samosa getSamosa() {
		   return samosa;
	   }
	   public void setSamosa(Samosa samosa) {
		   this.samosa = samosa;
	   }
	   public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	   }
	   public void stud()
       {
		   this.samosa.display();
    	   System.out.println("i am on stud class");
       }
}
