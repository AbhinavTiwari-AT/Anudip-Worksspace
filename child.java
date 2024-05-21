package com.anudip.javaDemo;
class parents
{
	String name;
}

public class child extends parents {
	
	String name;
	
	public void details()
	{
		super.name="parent";  
		name="child";
		System.out.println(super.name + " " + name);
	}
	
	public static void main(String[] args)
	{
		child ch= new child();
		ch.details();
		
	}

}
