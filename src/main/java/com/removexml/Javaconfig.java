package com.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.removexml")
public class Javaconfig {
	  @Bean
	  public Samosa getSamosa()
	  {
		 
		  return  new Samosa();
	  }
	  @Bean
      public Student getStudent ()
      {
		  Student student=new Student(getSamosa());
    	  return student;
      }
}
