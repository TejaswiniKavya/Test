package com.teju.HibernateFetching;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	

    	/*Laptopp laptop=new Laptopp();
    	laptop.setLid(104);
    	laptop.setBrand("lenovo");
    	laptop.setPrice(40000);
    	//laptop.setLname("dell");
    	
    	Alien alien=new Alien();
    	alien.setId(8);
    	alien.setAname("kavya");
    	
    	
    	alien.getLaps().add(laptop);  */
    	
    	
    	
    	
    	Configuration config=new Configuration().configure().addAnnotatedClass(Laptopp.class).addAnnotatedClass(Alien.class);
    	 ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	SessionFactory sf=config.buildSessionFactory(registry);
    	Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Alien a1=(Alien) session.get(Alien.class,5); // for fetching
        System.out.println(a1.getAname());  // JUST IT PRINS THE alien alss attribute bt wount include laptops thats y we will go for eager initialisation
        /*Collection<Laptopp> laps=a1.getLaps();
        
        for(Laptopp l: laps)
        {
        	System.out.println(l);
        } */
        
        
        
        //session.save(laptop);
       // session.save(alien);
        tx.commit();
    
    	
    }
}
