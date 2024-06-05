package loops;

public class whileloop {
	
	public static void main(String[] args)
	{
		int i=1;
		while(i<=10)  // to optimizer we can give condition (i<11)
		{
			System.out.println(i); //to optimiize we can give i++ in syso
			i=i+1;  //to optimize we can use assignment opreator i.e i+=1;
		}
	}

}
