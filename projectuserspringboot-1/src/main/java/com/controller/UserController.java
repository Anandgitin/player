package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	/*@PostMapping("/add")
	public User saveUser(@RequestBody User u) {
		return userService.saveUser(u);
	}*/
	
	@PostMapping("/add")
	public ResponseEntity<User> saveUser(@RequestBody User u){
		
		User user=userService.saveUser(u);
		
		return ResponseEntity.status(HttpStatus.CREATED).header("add","User Added").body(user);
	}
	
	@GetMapping("/getOne/{id}")
	public User getOneUser(@PathVariable("id")int id) {
		return  userService.getOneUser(id);
	}
}