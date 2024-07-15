package Multithread;

class customer
{
	int amount=10000;
	
	void withdraw(int amount)
	{
		System.out.println("Going for withdraw....");
		if(this.amount < amount)
		{
			System.err.println("Less Balance; waiting for Deposite !!");
		}
		this.amount = this.amount-amount;
		System.out.println(Thread.currentThread().getName() + " " + this.amount);
	      System.out.println("Withdraw complted");
	}
	void deposit(int amount)
	{
		System.out.println("Going for Deposit.....");
		this.amount=this.amount+amount;
		System.out.println(Thread.currentThread().getName() + " "+this.amount);
		System.out.println("Deposite completed");
	}
	
}
public class WaitNotifyDemo {
          public static void main(String[] args)
          {
        	 customer cust = new customer(); 
        	 
        	 new Thread()
        	 {
        		 public void run()
        		 {
        			 cust.withdraw(15000);
        		 }
        	 }.start();
        		 
        		 new Thread()
        		 {
        			 public void run()
        			 {
        				 cust.deposit(10000);
        			 }
        		 }.start();
        	 }
          }

