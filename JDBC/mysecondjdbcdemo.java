package Jbdc;
// this program is to retrive data from data base 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysecondjdbcdemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
	// resgister the driver
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//establish connection
	
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7681","root","abhinav3056");
	
	// cretate statement 
	//create statement object for sending sql statement to the data base
	Statement stmt = con.createStatement();
	
	 ResultSet  rs =stmt.executeQuery("select * from emp");
	 int id;
	 String name,desig,dept;
	 int sal;
	 
	 while(rs.next())
	 {
		 id= rs.getInt(1);
		 name = rs.getString(2);
		 desig = rs.getString(3);
	      dept= rs.getString(4);
			 sal = rs.getInt(5);
			 
			 System.out.println(id+ " " + name + " " + desig + " " + dept + " " + sal);
	 }
	 con.close();	
}
	
	
}
