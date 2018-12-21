package com.api.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Login;
import com.api.services.LoginServices;

@RestController
public class ValidationController {
	
	@Autowired
	LoginServices loginservice;
	@PostMapping("/validation")
	public String validate(@RequestBody String email)
	{
		System.out.println(email);
		//if(email=[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$)
		
		//Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
		Pattern p = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher m = p.matcher(email);
		if (m.find())
		{
		    return "Valid Email address";
		}
		else
		{
			return "Invalid Email address";
		}
		
		
	}
		
}