package com.first;  //This class is created for configuration to replace hello-servlet.xml

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.first"})//we can give multiple packages
public class AppConfig 
{
	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver vr= new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");  // create all views(.jsp) inside WEB-INF to make it private 
		vr.setSuffix(".jsp");  // so we can change any extension in in future
		return vr;
		
	}
	
	

	

}
