package com.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.User;
import com.api.repo.RegRepository;
@Service(value="abc")
public class RegistrationServiceImpl implements RegistationService {
	@Autowired
	private RegRepository regRepository;
	public void save(User user) {
		regRepository.save(user);
	}

}
