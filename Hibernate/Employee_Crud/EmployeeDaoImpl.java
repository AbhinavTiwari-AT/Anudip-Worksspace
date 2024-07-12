package com.hiberdemo.daoImpl;


import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hiberdemo.Dao.EmployeeDao;
import com.hiberdemo.config.HiberUtil;
import com.hiberdemo.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addEmp() {
		// TODO Auto-generated method stub
				
		Session session=HiberUtil.getSessionFactory().openSession();
			//return SessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();	
	      
		Scanner sc = new Scanner(System.in);
		
		//int empid;
		String firstName, surname, phone,address,desig;
		System.out.println("Enter the Firstname");
		firstName=sc.next();
		
		System.out.println("Enter the surname");
		surname=sc.next();
		
		System.out.println("Enter the mobile no");
		phone=sc.next();
		
		System.out.println("Enter the address");
		address=sc.next();
		
		System.out.println("Enter the designation");
		desig=sc.next();
		
		
		Employee emp = new Employee();
		emp.setFirstName(firstName);
		emp.setLastName(surname);
		emp.setPhone(phone);
		emp.setAddress(address);
		emp.setDesignation(desig);
		
		session.save(emp);
		                                    
		tx.commit();
		session.close();		
	
	}

	@Override
	public void deleteEmp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}
	
	

}
