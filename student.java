package com.anudip.javaDemo;


class student
{
	int rollNo;
	String name;
	float fees;
	

public student (int rollNo,String name,float fees)
{
  this.rollNo=rollNo;
  this.name=name;
  this.fees=fees;
}

void display()
{
	System.out.println(rollNo+ " " + name + " " + fees);
}

public static void main(String[] args)
{
	student s1=new student (1, "vaibhav", 223344.3f);
	student s2=new student (1, "vaibhav", 223344.3f);
	s1.display();
	s2.display();
	
	
}}