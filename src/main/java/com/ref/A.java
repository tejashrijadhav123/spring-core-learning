package com.ref;

public class A {
	private int no;
	private B bf;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public B getBf() {
		return bf;
	}
	public void setBf(B bf) {
		this.bf = bf;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [no=" + no + ", bf=" + bf + "]";
	}


}
