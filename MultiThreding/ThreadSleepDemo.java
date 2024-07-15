package Multithread;

public class ThreadSleepDemo extends Thread {

	@Override
	public void run() //running
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
			sleep(100);
		}  catch (InterruptedException e)
			{
			         e.printStackTrace();
			}
			}
	}
	public static void main(String[] args)
	{
		
		ThreadSleepDemo ts=new ThreadSleepDemo();
		ts.start();
	}
	
}
