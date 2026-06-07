package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/lifecycle/config.xml");
        //Samosa s=(Samosa) con.getBean("s1");
        con.registerShutdownHook();
        //System.out.println(s);

        System.out.println("----------------------------------------");
        //Pepsi y=(Pepsi) con.getBean("s2");
        //System.out.println(y);

        Ano a=(Ano) con.getBean("s3");
        System.out.println(a);


	}

}
