package com.hiberdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Wife {
	@Id
	private int w_id;
	private String wName;
	@OneToOne
	private Husband husband;
	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wife(int w_id, String wName, Husband husband) {
		super();
		this.w_id = w_id;
		this.wName = wName;
		this.husband = husband;
	}
	public int getW_id() {
		return w_id;
	}
	public void setW_id(int w_id) {
		this.w_id = w_id;
	}
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public Husband getHusband() {
		return husband;
	}
	public void setHusband(Husband husband) {
		this.husband = husband;
	}
	
	

}
