package com.teju.SpringCoreJavaAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    	
    	HelloWorld h=ctx.getBean(HelloWorld.class);
    	h.setMessage("Hello this is beautiful world!...");
    	h.getMessage();
    }
}
