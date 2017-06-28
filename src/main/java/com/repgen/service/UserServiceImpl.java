package com.repgen.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.repgen.model.User;
import com.repgen.repository.UserRepository;

@Service("user_Service")
public class UserServiceImpl implements UserService {

	@Resource(name = "repgen_userRepository")
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User addUser(String userName, String fullName, String email) {
		User user = new User();

		user.setUserName(userName);
		user.setFullName(fullName);
		user.setEmail(email);

		return userRepository.save(user);

	}





}
