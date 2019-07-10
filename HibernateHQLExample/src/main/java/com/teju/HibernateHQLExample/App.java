package com.teju.HibernateHQLExample;





import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
      
    Configuration config=new Configuration().configure().addAnnotatedClass(Studentt.class);
    ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    SessionFactory sf=config.buildSessionFactory(registry);
    Session session=sf.openSession();
    session.beginTransaction();
    
    
  /*  Random r=new Random();
    
    for(int i=1;i<=50;i++)   for storing values in db
    {
    	Studentt s=new Studentt();
    	s.setRollno(i);
    	s.setName("name"+i);
    	s.setMarks(r.nextInt(100));// marks should be with in 100
    	session.save(s);
    }
    
    */
    
   // Query q=session.createQuery("from Studentt");// query using hibernate // for all students //this Studentt is not a table name in the de, its a Entity name
    
    //Query q=session.createQuery("from Studentt where marks>50");
   // List<Studentt>  studentt= q.list();  // for fetching
    
    /*for(Studentt s: studentt)
    {
    	System.out.println(s);
    }*/
    
    /*Query q=session.createQuery("from Studentt where rollno=5");//its returning only one object not list
    Studentt studentt=(Studentt) q.uniqueResult();// its for only single row
     System.out.println(studentt);  */
    
 // for(Object o:studentt)   we cal also follow this to print
    // {
    //	 System.out.println(o);
    // }
     
     /*Query q=session.createQuery("select rollno,marks,name from Studentt where rollno=5");// we cant use * in HQL to access all columns instead of that we need to mention the column name// here rollno,marks,name will become a array and it will be returning array of object
     Object[] studentt=(Object[])q.uniqueResult();
     System.out.println(studentt[0]+":"+studentt[1]+":"+studentt[2]); */   //for one row
     
   /* Query q=session.createQuery("select rollno,marks,name from Studentt ");
    List<Object[]> studentts=(List<Object[]>)q.list();
    
    for(Object[] student:studentts)
     {
    	 System.out.println(student[0]+":"+student[1]+":"+student[2]);
     }  */
     
    /*Query q=session.createQuery("select rollno,marks,name from Studentt s where s.marks>60");  // we are using alising here reason is if we have another table with same column it should not get confused with other table column
    List<Object[]> studentts=(List<Object[]>)q.list();
    
    for(Object[] student:studentts)
     {
    	 System.out.println("Rollnuo="+student[0]+" : "+"Marks="+student[1]+" : "+"Name="+student[2]);
     }  */
     
     
    
   /* Query q=session.createQuery("select sum(marks) from Studentt s where s.marks>60");  // we are fetching sum of all marks of a sudent
    Long marks=(Long)q.uniqueResult();// unique result is for fetching one row
    
    System.out.println("Sum of marks="+marks);  */
     
    /*int b=60;
    Query q=session.createQuery("select sum(marks) from Studentt s where s.marks>:b");  //use variable instead of value
    q.setParameter("b", b);
    Long marks=(Long)q.uniqueResult();// unique result is for fetching one row
    
    System.out.println("Sum of marks="+marks);  */
    
    
    
    
    
    
    
    //use sql queies(Native Queries)
    
    
    /*SQLQuery query=session.createSQLQuery("select * from Studentt where marks>60"); // to print all columns
    query.addEntity(Studentt.class);
    List<Studentt> student=query.list();
    
    for(Studentt o: student)
    {
    	System.out.println(o);
    }    */
    
    
    SQLQuery query=session.createSQLQuery("select  name, marks from Studentt where marks>60");
    query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
    List<Studentt> student=query.list();
    
    for(Object o: student)
    {
    	Map m=(Map)o;
    	System.out.println("name="+m.get("name")+" : "+"marks="+m.get("marks"));
    }
    
    
    
    
    
    
    
    session.getTransaction().commit();
    	
    
    }
}
