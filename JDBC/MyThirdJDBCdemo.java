package Jbdc;
//unknown data to fill in database by taking from user
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyThirdJDBCdemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// resgister the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7681","root","abhinav3056");
		
		int id, sal;
		String name ,desig,dept;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the emplyee id");
		id = sc.nextInt();
		
		System.out.println("Enter the employee name");
		name = sc.next();
		
		System.out.println("Eneter the employee designation");
		desig = sc.next();
		
		System.out.println("Enter the employee Department");
		dept=sc.next();
		
		System.out.println("Enetr the Employee salary");
		sal= sc.nextInt();
		
		PreparedStatement pstmt =con.prepareStatement("insert into emp value(?,?,?,?,?)");
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, desig);
		pstmt.setString(4, dept);
		pstmt.setInt(5, sal);
		
		int i = pstmt.executeUpdate();
		con.close();
		System.out.println(i + "dekha add hua na");
		
		
	}	
	

}
