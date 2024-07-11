package com.hiberdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Child {
	@Id
	private int c_id;
	private String sName;
	@ManyToOne
	private Parent parent;
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child(int c_id, String sName, Parent parent) {
		super();
		this.c_id = c_id;
		this.sName = sName;
		this.parent = parent;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	

}
