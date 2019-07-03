package com.abc.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.abc.practice") // if we want multiple packages we can add using commas 
public class AppConfig {

	//@Bean
	//public Samsung getphone()
	/*{
	 return new Samsung();	
	}
	
	@Bean
	public MobileProceesor getprocessor()
	{
		return new SnapDragon(); 
	}   */
	
	// use instead of component scan for bean
	
}
