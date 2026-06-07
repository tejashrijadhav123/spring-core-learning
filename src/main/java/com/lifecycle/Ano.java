package com.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ano {
     private String subject;

	 public String getSubject() {
		 return subject;
	 }

	 public void setSubject(String subject) {
		 this.subject = subject;
	 }

	 @Override
	 public String toString() {
		return "Ano [subject=" + subject + "]";
	 }
	 @PostConstruct
	 public void start()
	 {
         System.out.println("Hello i am in init method of ano class");
	 }
	 @PreDestroy
	 public void destroy()
	 {
         System.out.println("Hello i am in destry method of ano class");
	 }

}
