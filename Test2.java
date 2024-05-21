package com.anudip.javaDemo;

public class Test2 {

	int a;
	int b;
	//default constructor
	
	Test2()
	{
		a=10;
		b=20;
	}
	
	 Test2 get()
	{
		return this;  //return the current class instance
	}
	void display()
	{
		System.out.println(" a= " + a + " " + " b= " + b);
	}
	public static void main(String[] args)
	{
		Test2 t2=new Test2();
	//	Test2 t2; //reference
		//new Test2();
		t2.get().display();;
	}
}
