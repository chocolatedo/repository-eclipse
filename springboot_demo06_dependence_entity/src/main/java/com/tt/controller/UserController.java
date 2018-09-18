package com.tt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tt.entity.User;

@RestController
public class UserController {

	@GetMapping("/newUser")
	public void newUser() {
			
		User user = new User();
		user.setId(15);
		user.setName("大航海");
		
		System.out.println(user);
		
	}
}
