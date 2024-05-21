package com.anudip.javaDemo;

//Array of object in java
//Array can hold the refrence to any type of objects.
// it is important to note that array can contain only reference to the
//object,not the object itself


/*  object1 object2 obj3
 *  1st 2nd 3rd 4th 5th - refrence
 * 
 */

class A
{
	int i;
}
public class arrayinjava6 {
	
	public static void main(String[] args)
	{
	   /* arrayinjava6 ar=  new arrayinjava6(); //object
	    
	    arrayinjava6 ar1;   //type(Arrayin java6)-reference variable
	    
	    new arrayinjava6();  //  instance of a class  */
		
		A[] a;  //declaring the array reference variable
		a=new A[5];  //creating an array object containing 5 refrences to A-type objects 
		
		a[1]=new A();  //creating an object of an A-type and assigning to the element at
		
		a[3] =new A()
	
		
	}
	
	

}
