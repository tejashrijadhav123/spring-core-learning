package com.construct;

import java.util.List;

public class Student {
	private int sid;
	private String name;
	private Division div;
	private List ll;
	public Student(int sid, String name, Division div, List ll) {
		super();
		this.sid = sid;
		this.name = name;
		this.div = div;
		this.ll = ll;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", div=" + div + ", ll=" + ll + "]";
	}



}
