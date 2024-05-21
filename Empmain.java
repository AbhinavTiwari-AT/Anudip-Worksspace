package com.anudip.javaDemo;


//Encapsulation
//pojo-plain old java object
//entity
//bean

class Employee
{
  private String name; 
 private String role;
 
 
public Employee(String name, String role) {
	super();
	this.name = name;
	this.role = role;
}


public Employee()
{
	this.name=name;
}



public  String getName()
{
	return name;
}


public void setName(String name)
{
	this.name=name;
}


public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}


public double calculatesalary()
{
	return 0.0;
}

}
class manager extends Employee
{
	private double baseasalary;
	private double bonus;
}

public class Empmain {

   public static void main(String[] args)
   {
	 //  System.out.println(name);
	   Employee emp=new Employee();
	   emp.setName("Abhinav");
	   emp.setRole("manager");
	   System.out.println(emp.getName());
	   System.out.println(emp.getRole());
   
   }
}