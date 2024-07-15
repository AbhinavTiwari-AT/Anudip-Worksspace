package Multithread;

public class AccountMAin {

	public static void main(String[] args) {
		
		Account ac1 = new Account();
		ac1.setName("vijaya");
		// TODO Auto-generated method stub
		Account ac2 = new Account();
		ac1.setName("Aniket");
		
		ac1.start();
		ac2.start();
	}

}
