package com.teju.Log4jHelloWorldExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static Logger log=Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	PropertyConfigurator.configure("log4j.properties");
    	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    	log.info("Going to create HelloWorld Object");
    	
    	HelloWorld obj=(HelloWorld)context.getBean("hello");
    	//obj.getMessage();
    	System.out.println(obj.getMessage());
    	log.info("Exiting the programme");
    }
}
