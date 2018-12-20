package com.api.repo;

import java.util.List;

import com.api.model.Login;
import com.api.model.User;

public interface RegRepository {

	void save(User user);
	boolean validateUser(Login login); 
	User getUsers(Login login);
	User getUserByName(String name);
	List<User> allusers(Login login);

}
