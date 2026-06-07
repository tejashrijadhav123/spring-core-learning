package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/autowire/config.xml");
        Address s=(Address) con.getBean("s1");
        System.out.println(s);
	}

}
