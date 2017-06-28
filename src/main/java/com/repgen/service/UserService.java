package com.repgen.service;

import java.util.List;


import com.repgen.model.User;

public interface UserService {

	public List<User> getUsers();
	
	public User addUser(String userName, String fullName, String email);
	
}
