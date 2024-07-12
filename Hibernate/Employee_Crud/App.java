package com.hiberdemo;

import java.util.Scanner;

import com.hiberdemo.daoImpl.EmployeeDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        EmployeeDaoImpl daoImpl = new EmployeeDaoImpl();
        char a;
        
        do {
              Scanner sc = new Scanner(System.in);
              System.out.println("Employee registartion!!!");
              System.out.println("1.add employee 2. display emp 3. update emp .4 . delete emp");
        	  System.out.println("Enter your choice");
        	  int ch=sc.nextInt();
       switch (ch)
        	  {
			case 1:
			{
			  daoImpl.addEmp();
				break;
			}
			case 2:
			{
				daoImpl.getEmployee();
				break;
			}
			case 3:
			{
				daoImpl.updateEmployee();
				break;
			}
			case 4:
			{
				daoImpl.deleteEmp();
				break;
			}
			case 5:
			
				System.exit(0);
				break;
        	  }
		   System.out.println("do you want to continue");
		   a= sc.next().charAt(0);
        
        } while (a=='Y'|| a=='y') ;
        	  {
				System.out.println("thanks");
        	  }
        } }