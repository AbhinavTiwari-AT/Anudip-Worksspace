package com.practice;

import javax.transaction.Transaction;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration  cfg= new Configuration(); 
        cfg.configure("hibernate.cfg.xml");
        
       SessionFactory factory= cfg.buildSessionFactory();
       
      
       // cretaing student
       
       Student st = new Student();
       st.setId(1111);
       st.setName("Abhi Tiwari");
       st.setEmail("abhinav@gamil.com");
       st.setAddress("pratapgarh");
       
       
       /*
        System.out.println(factory);
        System.out.println(factory.isClosed());   */
       
       System.out.println(st);
       
   Session session =   factory.openSession();
     
  org.hibernate.Transaction tx =  session.beginTransaction();
     session.save(st);
    tx.commit();
     

   
  /* session.beginTransaction().commit();
   session.save(st);
   session.getTransaction().commit();
   */
   session.close();
    }
    
}
