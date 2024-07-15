package Multithread;

public class Account extends Thread {
	
	static int balance=1000;
	
	public void run()
	{
		if(balance > 800)
		{
			synchronized (Account.class)  //thread saftey
			{
				if(balance > 800)
	
			
			System.out.println( Thread.currentThread().getName()+" " +" Your balance is "+ balance + " "+"u can withdraw the ammount");
			}
			try {
				sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			balance=200;
			System.out.println(Thread.currentThread().getName() + " "+" After withdraw your balance is  "+ balance );
		}
		else
		{
			System.out.println( Thread.currentThread().getName()+" " +" Your balance is "+ balance + " "+"u can withdraw the ammount");
		}
	}

}
