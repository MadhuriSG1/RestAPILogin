package com.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.model.Login;
import com.api.model.User;
import com.api.repo.RegRepository;

@Service
public class LoginServiceImpl implements LoginServices {

	@Autowired
	private RegRepository regRepository;
	@Override
	public boolean validateUser(Login login) {
		// TODO Auto-generated method stub
		return regRepository.validateUser(login);
		
	}
	@Override
	public User getUsers(Login login) {
		// TODO Auto-generated method stub
		return regRepository.getUsers(login);
	}
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return regRepository.getUserByName(name);
	}
	@Override
	public List<User> allusers(Login login) {
		// TODO Auto-generated method stub
		return regRepository.allusers(login);
	}
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
