package com.steriotypeanno;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  con=new ClassPathXmlApplicationContext("com/steriotypeanno/config.xml");
		//Student s=(Student) con.getBean("b");
		//System.out.println(s);
		Comapany c=(Comapany) con.getBean("comapany");
		System.out.println(c);
	}

}
