package com.anudip;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
    
       //build the session factory for configuration
       SessionFactory sessionFactory=cfg.buildSessionFactory();
       
     
       Employee emp = new Employee();
     
       emp.setId(2);
       emp.setName("Abhinav");
       emp.setDesig("Senior Manager");
       emp.setSal(30000);
       
       System.out.println(emp);  
       
     /*  Transaction tx=session.beginTransaction();
       
       
       session.save(emp);
       
       System.out.println("Employee got added");
       
       tx.commit();
       session.close();     */
       

       //open the session for 1 session factory
       Session session = sessionFactory.openSession();
       
      
         
      org.hibernate.Transaction tx =  session.beginTransaction();
         session.save(emp);
        tx.commit();
         

       
      /* session.beginTransaction().commit();
       session.save(st);
       session.getTransaction().commit();
       */
       session.close();
    }
}