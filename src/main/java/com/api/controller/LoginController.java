package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Login;
import com.api.model.User;
import com.api.services.LoginServices;

@RestController
public class LoginController {
	@Autowired
	LoginServices loginservice;
	@PostMapping("/login")
	public boolean login(@RequestBody Login logindetails)
	{
		System.out.println("login");
		return loginservice.validateUser(logindetails);
	}
	

}
