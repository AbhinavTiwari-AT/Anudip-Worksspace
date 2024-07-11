package com.anudip;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int id;
	private String deptName;
	private String noOfEmp1;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String deptName, String noOfEmp1) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.noOfEmp1 = noOfEmp1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getNoOfEmp1() {
		return noOfEmp1;
	}
	public void setNoOfEmp1(String noOfEmp1) {
		this.noOfEmp1 = noOfEmp1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
