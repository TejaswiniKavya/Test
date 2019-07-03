package com.abc.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary   we can also use Qualifier also
public class SnapDragon implements MobileProceesor{

	public void process() {
		
		
		System.out.println("WORLD BEST CPU");

	}

}
