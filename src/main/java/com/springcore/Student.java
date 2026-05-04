package com.springcore;

public class Student {
	private int studentid;
	private String studentname;
	private String studentaddress;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		System.out.println("calling setter stud id");
		this.studentid = studentid;
	}
	public String getStudentname() {
		System.out.println("calling getter stud id");
		return studentname;
	}
	public void setStudentname(String studentname) {
		System.out.println("calling setter stud name");
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		System.out.println("calling getter stud name");
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		System.out.println("calling setter stud add");
		this.studentaddress = studentaddress;
	}
	public Student(int studentid, String studentname, String studentaddress) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
		System.out.println("calling parameterized constructor ");
	}
	public Student() {
		super();
		System.out.println("calling default constructor ");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		System.out.println("calling to string method ");
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentaddress=" + studentaddress
				+ "]";
	}



}
