package com.teju.com.SpringCoreCollection;

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
     ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
     JavaCollection obj=(JavaCollection)context.getBean("javaCollection");
     obj.getAddressList();
     obj.getAddressSet();
     obj.getAddressMap();
     obj.getAddressProp();
    }
}
