package com.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/ref/config.xml");
        A a=(A) con.getBean("cc");
        System.out.println(a);
	}

}
