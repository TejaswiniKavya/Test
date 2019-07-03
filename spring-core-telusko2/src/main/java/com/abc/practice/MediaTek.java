package com.abc.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MediaTek implements MobileProceesor {

	public void process() {
		System.out.println("2nd best cpu");
		
	}

}
