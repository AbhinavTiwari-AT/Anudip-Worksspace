package com.hiberdemo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent {
	@Id
	private int p_id;
	private String pname;
	@OneToMany
	private Set<Child>child;

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(int p_id, String pname, Set<Child> child) {
		super();
		this.p_id = p_id;
		this.pname = pname;
		this.child = child;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Set<Child> getChild() {
		return child;
	}

	public void setChild(Set<Child> child) {
		this.child = child;
	}
	
	
	

}
