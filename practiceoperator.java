package com.anudip.javaDemo;

public class practiceoperator {
	
	int length=7;
	int breath=8;
	
	public void area() {
		int a= length*breath;
		System.out.println("the area is:-"+a);
	}
	
	public void perimter()
	{
		int p= 2* (length + breath );
		System.out.println("the perimeter is:-"+p);
		}
	
   public static void main(String[] agrs) {
	   practiceoperator j = new practiceoperator();
	   j.area();
	   j.perimter();
   }
}
