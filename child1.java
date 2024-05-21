package com.anudip.javaDemo;


class parent1
{
	String name;
	
	
	public void details()
	{
		name="Parent";
		System.out.println(name);
	}
}

public class child1 extends parent1 {
       String name;
       
       public void details()
       {
    	   super.details();   // calling the parents class details method()
    	   name="child";
    	   System.out.println(name);
       }
       public static void main(String[] args)
       {
    	 child1 ch=new child1();
    	   ch.details();
       }
}
