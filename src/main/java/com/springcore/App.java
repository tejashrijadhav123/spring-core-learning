package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        Student Stud1=(Student) con.getBean("s1");
        System.out.println(Stud1);
        Student Stud2=(Student) con.getBean("s2");
        System.out.println(Stud2);

    }
}
