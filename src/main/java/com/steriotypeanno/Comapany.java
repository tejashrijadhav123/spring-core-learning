package com.steriotypeanno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Comapany {
	@Value("#{10+20}")
	private int id;
	@Value("#{10-20}")
	private int no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Comapany [id=" + id + ", no=" + no + "]";
	}

}
