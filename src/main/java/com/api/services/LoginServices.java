package com.api.services;

import org.springframework.http.ResponseEntity;

import com.api.model.Login;
import com.api.model.User;

public interface LoginServices {

//	boolean validateUser(Login login);
	
	boolean validateUser(Login logindetails);
	

}
