package Enum;

// An Enum is a special "Class" that represent a group of constants

enum Directions
{
	EAST,
	WEST,
	SOUTH,
	NORTH
}

enum Weekdays
{
	Monday,
	Tuesday,
	wednesday,
	Thursday,
	fri,
	sat,
	sun
}
enum month
{
	jan,
	feb,
	march
}

enum icecreamsize
{
	small,
	medium,
	large
}
enum vehicle
{
	hatchback,
	sedan,
	suv
}


public class EnumSample {



	/*  final float pi=3.14f;
	final int SIN=3609;
	final int CI=33;

	
	public void displayConstant()
	{
		System.out.println(pi++);
	}*/
	
	public static void main(String[] args)
	{
		 Directions dir1= Directions.NORTH;
		 Directions dir2= Directions.EAST;
		 
		 System.out.println(dir1);
		 System.out.println(dir2);
		 
		 for(Directions dir : Directions.values())
		 {
			 System.out.println(dir);
		 }
		 
         Directions dir3=Directions.WEST;
         
         if(dir3 == Directions.EAST)
         {
        	 System.out.println("The Direction is East");
         }
         else if(dir3 == Directions.NORTH)
         {
        	 System.out.println("The Direction is North");
         }
         else if(dir3== Directions.SOUTH)
         {
        	 System.out.println("the Direction is South");
         }
         else
         {
        	 System.out.println("The Direction is West");
         }
	}

	
}
