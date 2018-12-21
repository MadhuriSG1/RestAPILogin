package com.api.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.model.Login;
import com.api.model.User;

public interface LoginServices {

	boolean validateUser(Login login);
	
	User getUsers(Login login);

	User getUserByName(String username);
	
	List<User> allusers(Login login);

	User saveuser(User user);

}
