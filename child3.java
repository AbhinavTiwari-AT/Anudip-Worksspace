package com.anudip.javaDemo;

class parent3
{
	String name;
	public parent3(String na)
	{
		name=na;
	}
}

public class child3 extends parent3 {
	
	String name;
	
  public child3(String n1, String n2)
	{
	    super(n1);
		name=n2;
		
	}   
    public void details()
    {
    	System.out.println(super.name + " " + name);
    }
	
	public static void main(String[] args)
	{
		child3 ch=new child3(null,null);
		ch.details();
	}

}
