package com.anudip.javaDemo;



class A   // outer class  //outer class cant be a private
{
	private int i;   //data member
	
	  private void methOdA()   // method
	{
		System.out.println(i);  //private field can be used weithin class
		B b=new B();             // private inner class can be used within class
		
	}
	
	private class B //inner class
	{
		
	}
}

class c  extends A
{
	void  methodOfB()
	{
		A a= new A();
		System.out.println(a.i);  //private field can not be used outerside the class
		a.methodOA();
		
		A.B b=new A.B();
	}
}

class D
{
	void methodOfD()
	{
	
	}
}
public class accessmodifier {

	public static void main(String[] args)
	{
		
	}
	
	
		
	
}
