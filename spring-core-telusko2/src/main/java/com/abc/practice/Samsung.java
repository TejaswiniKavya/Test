package com.abc.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTek")// decapitalised
	MobileProceesor cpu;
	
	public MobileProceesor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProceesor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("octa core,4gb, 4px");
		cpu.process();
	}

}
