package com.teju.HibernateCacheing;


import org.hibernate.Query;
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
    	
    	Alien a=null;
    	//Alien a=new Alien();
    	//a.setAname("teddy3");
    	//a.setAid(103);
    	//a.setColor("yellow"); 
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf=con.buildSessionFactory(reg);// session factory is a interface // this buildSessionFactory() method is deprecated
        Session session= sf.openSession();// session is also interface we cannot create the class
        
        Transaction tx= session.beginTransaction();
       
        //session.save(a);
        
        
        
       // a=(Alien)session.get(Alien.class,101);
        //System.out.println(a);
        
        
        Query q1=session.createQuery("from Alien where aid=101"); //using query to fetch the data
        q1.setCacheable(true); // query has to know we are using cacheable
        a=(Alien)q1.uniqueResult();
        System.out.println(a);
        
        
       // a=(Alien)session.get(Alien.class,102);
        //System.out.println(a);
        tx.commit();
        session.close();
        
        Session session1= sf.openSession();// session is also interface we cannot create the class
        
        Transaction tx1= session1.beginTransaction();
        
       // a=(Alien)session1.get(Alien.class,101);
       // System.out.println(a);
        Query q2=session1.createQuery("from Alien where aid=101"); //using query to fetch the data
        q2.setCacheable(true); 
        a=(Alien)q2.uniqueResult();
        System.out.println(a);
        
        tx1.commit();
        
    }
}
