package com.anudip.javaDemo;

public class Test3 {

	int a;
	int b;
	//default constructor
	Test3()
	{
		a=10;
		b=20;
	}
	void display(Test3 t1)
	{
		System.out.println("a =" + a + " " + " b = " + b ) ;
	}
	void get()
	{
		display(this);
	}
	public static void main(String[] args)
	{
		Test3 c=new Test3();
		c.get();
	}
}


