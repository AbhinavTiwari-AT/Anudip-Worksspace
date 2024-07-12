package com.hiberdemo;
import java.util.Iterator;
import java.util.ListIterator;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.type.ListType;

import antlr.collections.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Session session = Hiberutil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
      /*  Employee emp = new Employee();
        emp.setEmpName("Abhinav");
        emp.setDesig("sr.manager");
        emp.setDept("cs");
        emp.setSal("1000000");
        
        session.save(emp); */
        
        TypedQuery query = session.getNamedQuery("findEmpByName");
        query.setParameter("empName", "Abhinav");
        
        java.util.List<Employee>employees = query.getResultList();

        
        
		Iterator<Employee>itr =employees.iterator();
        while(itr.hasNext()) {
             Employee e = itr.next();
             System.out.println(e);
		}
        
        
        tx.commit();
        session.close();
        
        System.out.println("Employee added");
    }
}
