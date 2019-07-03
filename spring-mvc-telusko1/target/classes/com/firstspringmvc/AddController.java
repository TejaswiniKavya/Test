package com.firstspringmvc;

@Controller
public class AddController {

	public AddController() {
		
	}
	
	@RequestMapping("/add")
	public void hello()
	{
		System.out.println("I am here");
	}

}
