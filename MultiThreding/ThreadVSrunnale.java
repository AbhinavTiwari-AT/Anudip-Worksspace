package Multithread;

class ImplementsRunnable implements Runnable
{
	private int counter = 0;
	@Override
	public void run()
	{
		counter++;
		System.out.println("Implement Runnable  : Counter " + counter);
	}
}
class ExtendsThread extends Thread
{
	private int counter = 0;
	@Override
	public void run()
	{
		counter++;
		System.out.println("Extends Thread  : Counter " + counter);
	}
}

public class ThreadVSrunnale {
	
	public static void main(String[] args)
	{
		ExtendsThread th1=new ExtendsThread();
		th1.start();
		
		ExtendsThread th2=new ExtendsThread();
		th2.start();
		
		ExtendsThread th3=new ExtendsThread();
		th3.start();
		
		System.out.println("=================");
		
		ImplementsRunnable ir1=new ImplementsRunnable();
		
		Thread t1 = new Thread(ir1);
		t1.start();
		

	//	ImplementsRunnable ir2=new ImplementsRunnable();
		Thread t2 = new Thread(ir1);
		t2.start();
		

	//	ImplementsRunnable ir3=new ImplementsRunnable();
		Thread t3 = new Thread(ir1);
		t3.start();
	}

}
