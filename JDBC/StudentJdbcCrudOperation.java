
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentJdbcCrudOperation {

	private static final boolean Exception = false;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1 register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//step 2 establish the connection
				
				// Database URL, USERNAME, PASSWORD
				
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7681","root","Vaibhav@94");
				
				//step 3 : Creating a Statement
				Statement stmt = con.createStatement();
				
				Scanner sc=new Scanner(System.in);
				int Operation;
				
				do {
					System.out.println("Available Operations: ");
					System.out.println("1. Create");
					System.out.println("2. Retrive");
					System.out.println("3. Update");
					System.out.println("4. Delete");
					System.out.println("5. Exit");
					System.out.println("please Enter the action number that you want to perform");
					
					Operation=sc.nextInt();
					sc.nextLine();
					
					switch(Operation)
					{
					case 1:
						System.out.println("Enter the Student ID");
						int id=sc.nextInt();
						System.out.println("Enter the Student first name");
						String firstname=sc.next();
						System.out.println("Enter the Student last name");
						String lastname=sc.next();
						System.out.println("Enter the Student grade ");
						String grade=sc.next();
						System.out.println("Enter the Student age");
						int age=sc.nextInt();
						
						PreparedStatement pstmt= con.prepareStatement("insert into student values(?,?,?,?,?)");
						
						//seting valuse which we take from user
						pstmt.setInt(1, id);
						pstmt.setString(2, firstname);
						pstmt.setString(3, lastname);
						pstmt.setString(4, grade);
						pstmt.setInt(5, age);
						
						int i= pstmt.executeUpdate();
						con.close();
						System.out.println(i + "Record Insert successfully");
						
						break;
						
					case 2: 
//						Statement stmt=con.createStatement();
						
						ResultSet rs= stmt.executeQuery("select * from student");
//						int id;
//						String firstname, lastname, grade;
//						int age;
						
						System.out.println("student details");
						System.out.println("=============");
						
						while(rs.next()) {
							id=rs.getInt(1);
							firstname=rs.getString(2);
							lastname=rs.getString(3);
							grade=rs.getString(4);
							age=rs.getInt(5);
							
							System.out.println(id + " " + firstname +" " + lastname +" "+ grade + " " + age );
									
							
							
						}
						
						con.close();
						break;
						
					case 3:
						String sql = "Update student" + " set age=19  where id=102 ";
						
						int rowsAffected = stmt.executeUpdate(sql);
						
						//display the result of the Update with condition and if record not found with specific ID then it will notify
						
						if(rowsAffected > 0) {
							System.out.println("Record Update successfully..");
						}
						else {
							System.out.println("NO Record found with the specified ID..");
						}
						

						con.close();
						break;
						
					case 4:
						String vai="delete from student Where id=101";
						int rowsAffecteds = stmt.executeUpdate(vai);
						
						//display the result of the deletion with condition and if record not found with specific ID then it will notify
						
						if(rowsAffecteds > 0) {
							System.out.println("Record delete successfully..");
						}
						else {
							System.out.println("NO Record found with the specified ID..");
						}
						

						con.close();
						
						break;
						
						default:
							System.out.println("Enter a valid action number");
						
					}
					
				} while(Exception);
	}

}
