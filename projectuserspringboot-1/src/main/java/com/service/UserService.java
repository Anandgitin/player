package com.service;
import com.model.User;


public interface UserService {
	
	User saveUser(User u);
    
	public User getOneUser(int id);
}
