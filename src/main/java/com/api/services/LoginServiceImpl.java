package com.api.services;

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

}
