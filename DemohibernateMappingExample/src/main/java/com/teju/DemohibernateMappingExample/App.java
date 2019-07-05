package com.teju.DemohibernateMappingExample;

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
    	Laptop laptop=new Laptop();
    	laptop.setId(105);
    	laptop.setLname("Hp");
    	//laptop.setId(109);
    	//laptop.setLname("dell");
    	
    	Student student=new Student();
    	student.setRollnum(5);
    	student.setName("raju");
    	student.setMarks(50);
    	//student.setLaptop(laptop);
    	student.getLaptop().add(laptop);
    	
    	
    //	laptop.getStudent().add(student);
    	
    	
    	
    	
    	
    	
        Configuration config=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sf=config.buildSessionFactory(registry);
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(laptop);
        session.save(student);
        tx.commit();
    
    
    }
}
