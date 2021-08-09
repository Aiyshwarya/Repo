package com.pollingApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class pollingApplicationController 
{
	@GetMapping("home")
	public String GetHome()
	{
		return "Success";
	}
	
}
