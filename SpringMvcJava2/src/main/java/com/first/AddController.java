package com.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {

	public String adding(@RequestParam("t1") int num1, @RequestParam("t1") int num2)
	{
		
		int k=num1+num2;
		
		
		return "display.jsp";
	}

}
