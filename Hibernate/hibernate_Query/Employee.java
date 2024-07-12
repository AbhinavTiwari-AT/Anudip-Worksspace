package com.hiberdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries(
		{
			@NamedQuery(
					name="findEmpByName",
					query="from Employee e where e.empName=:empName"
					)
	/*		@NamedQuery(
					name="findEmpByDesig",
					query = "From Employee e "
					)
			*/
			
		})


@Entity
@Table(name = "emp111")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private String dept;
	private String desig;
	private String sal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String dept, String desig, String sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.desig = desig;
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
 
		
		return  this.empId+ " :" +this.dept+" : " +this.desig + " :"+ this.sal;
	}
	
	


}
