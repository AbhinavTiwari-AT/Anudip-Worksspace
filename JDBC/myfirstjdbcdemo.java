package Jbdc;

// this program is to add data into database using java 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class myfirstjdbcdemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7681","root","abhinav3056");
		
		//creating the statement
		//create statement object for sending SQL statement
		
		Statement stmt = con.createStatement();
		
		//stmt.execute(null);
		stmt.executeUpdate("insert into emp values(123,'abhinav','cse','xyz' ,50000)");
		//stmt.executeQuery(null);  
		
		System.out.println("Employee add hua");
	}

}
