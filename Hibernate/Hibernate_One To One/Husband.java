package com.hiberdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

// association-has relation

@Entity
public class Husband {
	@Id
	private int h_id;
	private String hName;
	@OneToOne
	private Wife wife;
	public Husband() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Husband(int h_id, String hName, Wife wife) {
		super();
		this.h_id = h_id;
		this.hName = hName;
		this.wife = wife;
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}

	
	
}
