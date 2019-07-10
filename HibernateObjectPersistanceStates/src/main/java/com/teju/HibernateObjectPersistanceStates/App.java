package com.teju.HibernateObjectPersistanceStates;

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
    	
       Configuration config=new Configuration().configure().addAnnotatedClass(Laptop.class);
       SessionFactory sf=config.buildSessionFactory();
       Session session=sf.openSession();
       session.beginTransaction();
      
      /* Laptop l=new Laptop(); // now object in transient state, when application shuts down this will loose the data
       l.setBrand("lenovo");
       l.setId(52);
       l.setPrice(800);*/
       
       // session.save(l); // object in persistence state
       //l.setPrice(750);//if we change the price , it chnges in database also
      
      // session.remove(l);//removes from database
       //session.getTransaction().commit();
       
     //  session.detach(l); if u made changes after commit, it wont affect to ur object
      //l.setPrice(600);
       
       
       //   data fetching in hybernate
       
       
       
      //Laptop lop=(Laptop) session.get(Laptop.class,54);// get method everytime hits the database when we send the request
       
       Laptop lop=(Laptop) session.load(Laptop.class,54);// load does not hit the object for every request
       try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       
       	System.out.println(lop);
       	
       	session.getTransaction().commit();
       
    }
}
