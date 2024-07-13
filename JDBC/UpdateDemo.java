package Jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String city1 = "Pune";
		String email1 = "abhinav@gamil.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7681","root","abhinav3056");
		
		PreparedStatement pstmt =con.prepareStatement("update into emp city=? where email = ?");
		
		pstmt.setString(1, city1);
		pstmt.setString(2, email1);
		
		int count = pstmt.executeUpdate();
		if(count >0)
		{
			System.out.println("Update Successfully");
		}
		else
		{
			System.out.println("updation faild");
		}
      con.close();				
	}

}
