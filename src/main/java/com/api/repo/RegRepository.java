package com.api.repo;

import com.api.model.Login;
import com.api.model.User;

public interface RegRepository {

	void save(User user);
	boolean validateUser(Login login); 

}
