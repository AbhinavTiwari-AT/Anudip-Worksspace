package com.anudip.javaDemo;

public class demoarray {

	public static void main (String[] args)
	{
		int[] a= {12,21,0,5,7};  //declaring and initializing an array of 
		int[] b= new int[a.length];
		//int[] b=new int[5];
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
			 System.out.println(b[i]);
		}
		a[4]=56;
        System.out.println(b[2]);
        System.out.println(a[2]);
	}

}
