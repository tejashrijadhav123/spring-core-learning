package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	    @Autowired
	    @Qualifier("s1")
        private Address adress;

		public Address getAdress() {
			return adress;
		}

		public void setAdress(Address adress) {
			this.adress = adress;
		}

		@Override
		public String toString() {
			return "Student [adress=" + adress + "]";
		}

		public Student(Address adress) {
			super();
			this.adress = adress;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
        
}
