package loops;

//public class forloop {
 
//	public static void main(String[] args)
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
		
//		}
//	}
	
//}


	class pattern{
		
		public void star()

		{
			for(int i=0;i<=5;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	class forloop{
	
	public static void main(String[] args)
	{
	    pattern p=new pattern();
	    p.star();
	}
}
