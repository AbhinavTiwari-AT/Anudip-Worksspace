package com.hiberdemo;

//import javax.transaction.Transaction;

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
        
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        org.hibernate.Transaction tx = session.beginTransaction();
        
        Husband hs = new Husband();
        Wife wf = new Wife();
        
        
        hs.setH_id(2);
        hs.sethName("Ranveer");
        hs.setWife(wf);
        
        wf.setW_id(2);
        wf.setwName("Aliya");
        wf.setHusband(hs);
        
        session.save(wf);
        session.save(hs);
        
        tx.commit();
        session.close();
        
        System.out.println("Husband Wife Added");
    }
}
