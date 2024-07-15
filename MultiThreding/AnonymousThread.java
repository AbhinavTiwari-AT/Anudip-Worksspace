package Multithread;




public class AnonymousThread {
 public static void main(String[] args)
 {
	 new Thread()
	 {
		 public void run()
		 {
			 System.out.println("Kuch to task");
		 }
	 }.start();
	 
	// ImplermentRunnable ir = new ImplementRunnable();
	// Thread t1=new Thread(ir);
	 
	 new Thread (new Runnable()
	 {
		 @Override
		 public void run() 
		 {
			 
		 }
	 }).start();
 } 
}
