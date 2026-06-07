package com.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/construct/config.xml");
		Student s=(Student) con.getBean("s2");
		System.out.println(s);

	}

}
