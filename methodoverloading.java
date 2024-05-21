package com.anudip.javaDemo;

public class methodoverloading {

	class operation1{
		
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
	}
	
	
	public void add(int a,int b,int c)
	{
		int result=a+b+c;
		System.out.println(result);
		
	}
	
	public void add(int a,int b,float c)
	{
		float result=a+b+c;
		System.out.println(result);
	}
	public static void main(String[] args)
	{
		
	}
}}
