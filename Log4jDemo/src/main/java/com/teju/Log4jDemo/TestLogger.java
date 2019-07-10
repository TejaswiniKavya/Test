package com.teju.Log4jDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {

	
	final static Logger logger=Logger.getLogger(TestLogger.class);//this one is recommended
	//final static Logger logger=Logger.getLogger("TestLogger");
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is DEBUG"); 
		logger.info("This is INFO");
		logger.warn("This is WARN");
		logger.error("This is ERROR");
		logger.fatal("This is FATAL");
	}

}
