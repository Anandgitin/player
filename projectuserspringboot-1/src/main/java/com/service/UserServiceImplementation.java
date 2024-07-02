package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.UserRepository;
import com.model.User;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository userRepo;
	public User saveUser(User u) {
		return userRepo.save(u);
	}
		public User getOneUser(int id)
		{
			return userRepo.findById(id).orElse(null);
		}
	}
	
