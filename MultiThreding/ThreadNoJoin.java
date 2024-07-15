package Multithread;

public class ThreadNoJoin extends Thread {
	
	public void run()
	{
		System.out.println("Break-fast");
		System.out.println("Lunch");
		System.out.println(Thread.currentThread().getId());
		
		try {
			sleep(2000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +" ");
		
		
	}
	public static void main(String[] args)
	{
		ThreadNoJoin j1=new ThreadNoJoin();
		ThreadNoJoin j2=new ThreadNoJoin();
		j1.setName("Abhinav");
		j2.setName("vijaya");
		j1.start();
		j2.start();
	}

}
