package com.teju.SpringCoreOveride;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
    	
    	HelloWorld objA=(HelloWorld)context.getBean("helloworld");
    	objA.getMessage1();
    	objA.getMessage2();
    	
    	
    	HelloIndia objB=(HelloIndia)context.getBean("helloindia");
    	objB.getMessage1();
    	objB.getMessage2();
    	objB.getMessage3();
    	
    }
}
