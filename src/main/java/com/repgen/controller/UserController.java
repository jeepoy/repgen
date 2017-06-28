package com.repgen.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.repgen.model.User;
import com.repgen.service.UserService;

@Controller
public class UserController {
	
	@Resource(name = "user_Service")
	UserService userService;
	
	
	@RequestMapping(value = "/users")
	@ResponseBody
	public List<User> getUsers() {
		
		return userService.getUsers();
		
	}
	
	@RequestMapping(value = "/addUser/{userName}/{fullName}/{email}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User addUser(@PathVariable("userName") String userName, @PathVariable("fullName") String fullName, @PathVariable("email") String email  )  {
		
		return userService.addUser(userName, fullName, email);
		
	}
	
	@ExceptionHandler(org.hibernate.exception.ConstraintViolationException.class)
	public String duplicate() {
		return "Kina Kina Dude, Gamit na tong user name na to dude!!";
		
	}
	



}
