package com.demo;

/*  data types              wrapper classes
 * byte                      Byte        //collection of object // collection ApI
 * short                     Short
 * int                       Integer
 * long                      Long
 * float                     Float
 * double                    Double
 * char                      Charater
 * boolean                   Boolean
 */




public class WrapperDemo {
	
/*	static void overloadMethod(Integer i)
	{
		System.out.println("Integer Wrapper class type");
	}
	static void overloadMethod(long l)
	{
		System.out.println("long primitive type");
	}
	
	public static void main(String[] args)
	{
		int i= 21;
		overloadMethod(i);     // auto widning / implicitcasting
	}
    */

// 1. if you are passing primitive data type as a arguments to the method  call,compiler
	
	static void overloadMethod(Number n)
	{
		System.out.println("Number type class");
	}
	
	static void overloadMethod(Double i)
	{
		System.out.println("Integer Wrapper class type");
	}
	static void overloadMethod(Long l)
	{
		System.out.println("long primitive type");
	}
	
	public static void main(String[] args)
	{
		int i= 21;
		overloadMethod(i);     // primitive typem of data into object type- Auto boxing -unboxing
	}
}
/*
                         object             ^   - Auto upcasting
                                            |
                         number             |
                                            ^
 Byte   Short  Integer  Long Float  Double  |
                                            |
                                            |  Auto- Boxing
 
 byte short  int   long    float   double  |
 
------------> Auto Widening-----------> 


*/