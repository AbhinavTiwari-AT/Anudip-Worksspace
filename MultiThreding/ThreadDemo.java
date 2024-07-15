package Multithread;
//Multithreading 
//Application is a program which is designed to perform some specific task.
// word - video player - google crome -


abstract class th1 implements Runnable
{
	
}

class Thread1 extends Thread
{
	public void display()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread1 "+i);
		}
	}
}
class Thread2  extends  Thread
{
	public void display()
	{ 
		for(int i=11;i<=20;i++)
		{
		System.out.println("Thread2 "+i);
	}}
}

public class ThreadDemo {
	
	public static void main(String[] args)
	{
		Thread1 t1=new Thread1();
		 t1.display();
		 
		 Thread2 t2=new Thread2();
		 t2.display();
		 
		 System.out.println("in main");
	}

}
