package com.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	   public static void main(String args[])
	   {
      ApplicationContext con=new AnnotationConfigApplicationContext(Javaconfig.class);
      Student s=(Student) con.getBean("getStudent");
      System.out.println(s); 
      s.stud();
	   }
}
