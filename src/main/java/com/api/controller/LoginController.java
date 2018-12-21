package com.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Login;
import com.api.model.User;
import com.api.services.LoginServices;

@RestController
@Controller
public class LoginController {
	@Autowired
	LoginServices loginservice;
	@PostMapping("/firstuser")
	public User login(@RequestBody Login loginreq)
	{
		User u=loginservice.getUsers(loginreq);
		//System.out.println(loginreq.getUsername());
		return u;
	}
	 

@PostMapping("/isusers")
	public  boolean getUser(@RequestBody Login loginreq)
	{
	   boolean b=loginservice.validateUser(loginreq);
		return b;
		}

//@GetMapping(value="/allusers", method = RequestMethod.GET)
//@RequestMapping(value = "/allusers", method = RequestMethod.GET)
@PostMapping("/allusers")
@ResponseStatus(value = HttpStatus.ACCEPTED)
public  List<User> getAllUsers(@RequestBody Login loginreq)
{
	List<User> list=loginservice.allusers(loginreq);
	return list;
	}

@GetMapping("/userbyname")
public User getUserByName(@RequestParam String username)
{
	System.out.println(username);
	User u=loginservice.getUserByName(username);
	return u;
}

/*@PostMapping(consumes = "/create")
public User create(@RequestBody User user) {
    return loginservice.saveuser(user);
}*/


}


