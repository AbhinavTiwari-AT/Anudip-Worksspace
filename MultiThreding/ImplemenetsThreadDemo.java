package Multithread;

class ThreadOne implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+ i);
		}
		
	}
	
}

public class ImplemenetsThreadDemo {
                     public static void main(String[] args)
                     {
                    	 ThreadOne t1=new ThreadOne();
                    	 
                    	 Thread th=new Thread(t1);
                    	 th.start();
                     }
}
