package com.hiberdemo.config;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hiberdemo.entity.Employee;

public class HiberUtil {
	
	private static SessionFactory sessionFactory;
	
        public static SessionFactory getSessionFactory() 
          {
        	if(sessionFactory == null)
        	{
        	   Properties settings =new Properties();
        	   settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver") ;
        	   settings.put(Environment.URL,"jdbc:mysql://localhost:3306/database");
        	   settings.put(Environment.USER,"root");
        	   settings.put(Environment.PASS,"abhinav3056");
        	   settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
        	   settings.put(Environment.HBM2DDL_AUTO,"update");
        	   settings.put(Environment.SHOW_SQL,"true");
        	   
        	   Configuration cfg = new Configuration();
        	   cfg.setProperties(settings);
        	   cfg.addAnnotatedClass(Employee.class);
        	   
        	   ServiceRegistry serviceRegistry=(ServiceRegistry) new StandardServiceRegistryBuilder()
        	   .applySettings(cfg.getProperties()).build();
        	   
        	   sessionFactory=cfg.buildSessionFactory(serviceRegistry);
        	   
        	   //properies ->set cfg-> cfg apply to serviceregistry- serviceRegistry build - give sessionfactory
        	   
        	}
	         return sessionFactory;
            
            }

		
}
