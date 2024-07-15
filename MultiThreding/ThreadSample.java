package Multithread;

public class ThreadSample  extends Thread {

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " "+ i);
		}
	}
	
	public static void main(String[] args)
	{
		ThreadSample ts=new ThreadSample();  //new
		ts.start();  //runnable
		try
		{
		ts.start();
		}
		catch(IllegalThreadStateException il)
		{
			System.out.println("State confuge hua");
		}
		System.out.println("mail  vala bhi statment");
	}
}
