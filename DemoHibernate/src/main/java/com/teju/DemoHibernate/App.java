package com.teju.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //Alien a=new Alien();
       //a.setAid(104);
       //a.setAname("rani22");
       //a.setColour("yelloo");
    	
    	AlienName an=new AlienName();
    	an.setFname("Teju");
    	an.setLname("Shivakumar");
    	an.setMname("swini");
    	
       
       Alien a=new Alien();
       a.setAid(101);
       a.setAname(an);
       a.setColour("red");
       
       
       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf=con.buildSessionFactory(reg);// session factory is a interface // this buildSessionFactory() method is deprecated
       Session session= sf.openSession();// session is also interface we cannot create the class
       
       Transaction tx= session.beginTransaction();
       //session.save(a);	//to save the data in a object into database
       
       //a=(Alien)session.get(Alien.class,104);  // this is for to fetch the data from database
       
       
       session.save(a);
       
       tx.commit();
       
       
       System.out.println(a);
       
        
    }
}	
