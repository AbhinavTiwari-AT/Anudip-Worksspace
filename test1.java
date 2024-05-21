package com.anudip.javaDemo;

public class test1 {
	
	int a;
	int b;
	
	Test1()
	{
		this(10);
		System.out.println("Im in default constructor");
	}
             test1(int a, int b)
             {
            	 this.a=a;
            	 this.b=b;
            	 System.out.println("Im in paratetrized constructor");
             }
             Test1(int a)
             {
            	 System.out.println();
             }
}
