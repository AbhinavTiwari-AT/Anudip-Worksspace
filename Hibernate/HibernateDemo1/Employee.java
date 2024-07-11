package com.anudip;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name="emp_details")
	public class Employee {

		@Id
		int id;
		@Column(name="empname",length = 20)
		private String name;
		@Column(name = "empdesig",length = 25)
		private String desig;
		@Column(name = "empsal")
		private int sal;
		
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int id, String name, String desig, int sal) {
			super();
			this.id = id;
			this.name = name;
			this.desig = desig;
			this.sal = sal;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesig() {
			return desig;
		}
		public void setDesig(String desig) {
			this.desig = desig;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.id+" : "+this.name+" : "+this.desig+" : "+this.sal;
		}
}