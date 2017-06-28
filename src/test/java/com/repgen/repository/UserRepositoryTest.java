package com.repgen.repository;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.repgen.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	
	@Resource(name = "repgen_userRepository")
	private UserRepository userRepository;
	

	@Test
	public void addUserTest() {
		User user = new User();
		
		
	}
	
	@Test
	public void findAllTest() {
		List<User> users = userRepository.findAll();
		
		System.out.println(users.size());
		
	}
}
